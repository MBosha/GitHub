/*
 * Автор - Руи Сантос (Rui Santos)
 * Более подробно о проекте на: randomnerdtutorials.com
 */
 
// отправка данных от Arduino на ESP8266
// через последовательный порт на скорости 9600 бод:
 
void setup() {
    Serial.begin(9600);
}
 
void loop() {
    Serial.print("HI!");  //  "ПРИВЕТ!"
    delay(1000);
}