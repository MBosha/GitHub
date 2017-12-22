-- Автор – Руи Сантос (Rui Santos)
-- Более подробно о проекте на http://randomnerdtutorials.com
-- Сервер ESP8266
 
print("ESP8266 Server")  --  "Сервер ESP8266"
wifi.setmode(wifi.STATIONAP);
wifi.ap.config({ssid="test",pwd="12345678"});
print("Server IP Address:",wifi.ap.getip())  --  "IP-адрес сервера:"
 
sv = net.createServer(net.TCP)
sv:listen(80, function(conn)
    conn:on("receive", function(conn, receivedData)
        print("Received Data: " .. receivedData)      
          --  "Полученные данные: "
    end)
    conn:on("sent", function(conn)
      collectgarbage()
    end)
end)