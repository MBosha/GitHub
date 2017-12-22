-- Автор – Руи Сантос (Rui Santos)
-- Более подробно о проекте на http://randomnerdtutorials.com
-- Клиент ESP8266
 
print("ESP8266 Client")  --  "Клиент ESP8266"
wifi.sta.disconnect()
wifi.setmode(wifi.STATION)
wifi.sta.config("test","12345678") –- подключаемся к серверу
wifi.sta.connect()
print("Looking for a connection")  --  "Поиск соединения"
 
tmr.alarm(1, 2000, 1, function()
     if(wifi.sta.getip()~=nil) then
          tmr.stop(1)
          print("Connected!")  --  "Подключились!"
          print("Client IP Address:",wifi.sta.getip())
            --  "IP-адрес клиента:"
          cl=net.createConnection(net.TCP, 0)
          cl:connect(80,"192.168.4.1")
          tmr.alarm(2, 5000, 1, function()
            cl:send("Hello World!")
          end)
      else
         print("Connecting...")  --  "Подключение..."
      end
end)