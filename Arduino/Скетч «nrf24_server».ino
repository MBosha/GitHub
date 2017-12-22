// Скетч «nrf24_server»
 
#include <SPI.h>
#include <RH_NRF24.h>
 
// создаем экземпляр класса для трансивера:
RH_NRF24 nrf24;
// RH_NRF24 nrf24(8, 7);   // для электрической совместимости с Mirf
// RH_NRF24 nrf24(8, 10);  // для Leonardo; также понадобится
                           // явно определить контакт SS
// RH_NRF24 nrf24(8, 7);   // для RFM73 на Anarduino Mini
 
void setup()
{
  Serial.begin(9600);
  while (!Serial)
    ; // ждем подключения последовательного порта
      // (нужно только для Leonardo):
  if (!nrf24.init())
    Serial.println("init failed");  //  "инициализация не удалась"
  // по умолчанию после инициализации трансивер настраивается
  // со следующими параметрами: 2,402 ГГц (канал 2), 2 Мбит/сек, 0 дБм
  if (!nrf24.setChannel(1))
    Serial.println("setChannel failed");
    //  "не удалось выполнить функцию setChannel()"
  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm))
    Serial.println("setRF failed");  
    //  "не удалось выполнить функцию setRF()"  
}
 
void loop()
{
  if (nrf24.available())
  {
    // сообщение уже должно прийти:  
    uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
    uint8_t len = sizeof(buf);
    if (nrf24.recv(buf, &len))
    {
//      NRF24::printBuffer("request: ", buf, len);
      Serial.print("got request: ");  //  "получен запрос: "
      Serial.println((char*)buf);
     
      // отправляем ответ:
      uint8_t data[] = "And hello back to you";  //  "И тебе привет!"
      nrf24.send(data, sizeof(data));
      nrf24.waitPacketSent();
      Serial.println("Sent a reply");  //  "Отправляем ответ"
    }
    else
    {
      Serial.println("recv failed");  //  "не удалось выполнить...
                                      //  ...функцию recv()"
    }
  }
}