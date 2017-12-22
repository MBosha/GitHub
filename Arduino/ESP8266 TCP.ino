//Allocate an "espconn"
pHTTPServer = (struct espconn *)os_zalloc(sizeof(struct espconn));
ets_memset( pHTTPServer, , sizeof( struct espconn ) );
 
//Initialize the ESPConn
espconn_create( pHTTPServer );
pHTTPServer->type = ESPCONN_TCP;
pHTTPServer->state = ESPCONN_NONE;
 
//Make it a TCP conention.
pHTTPServer->proto.tcp = (esp_tcp *)os_zalloc(sizeof(esp_tcp));
pHTTPServer->proto.tcp->local_port = 80;
 
//"httpserver_connectcb" gets called whenever you get an incoming connetion.
espconn_regist_connectcb(pHTTPServer, server_connectcb);
 
//Start listening!
espconn_accept(pHTTPServer);
 
//I don't know what default is, but I always set this.
espconn_regist_time(pHTTPServer, 15, );