1. Introduccion
En este ejemplo, implementaremos un sistema cliente-servidor b ́asico en Java utilizando sockets

TCP/IP. El cliente enviar ́a un mensaje al servidor, y el servidor responder ́a con un mensaje de confir-
maci ́on. Esto ilustrar ́a el proceso de establecimiento de conexi ́on, env ́ıo y recepci ́on de datos entre un

cliente y un servidor.
2. Funcionamiento
El funcionamiento del sistema cliente-servidor se puede dividir en los siguientes pasos:
2.1. Configuraci ́on del Servidor
El servidor debe configurarse para esperar conexiones entrantes en un puerto espec ́ıfico. Una vez que
recibe una conexion, debe estar preparado para recibir datos del cliente y responder apropiadamente.
2.2. Configuracion del Cliente
El cliente debe conectarse al servidor utilizando la direcci ́on IP y el puerto del servidor. Una vez
conectado, puede enviar datos al servidor y esperar una respuesta.
2.3. Env ́ıo de Datos
Una vez que el cliente y el servidor est ́an conectados, el cliente puede enviar datos al servidor
utilizando el socket de salida.
2.4. Recepci ́on de Datos
El servidor recibe los datos del cliente utilizando el socket de entrada. Despu ́es de procesar los
datos, el servidor puede enviar una respuesta al cliente.


4. Explicacion del Codigo
El servidor espera conexiones entrantes en el puerto 12345 utilizando ServerSocket.
Cuando el cliente se conecta, se acepta la conexi ́on y se crea un nuevo socket para la comunicaci ́on
con ese cliente.
El servidor lee el mensaje enviado por el cliente utilizando un BufferedReader.
El servidor env ́ıa una respuesta al cliente utilizando un PrintWriter.
El cliente se conecta al servidor utilizando la direcci ́on IP ”localhost 2 el puerto 12345.

El cliente env ́ıa un mensaje al servidor utilizando un PrintWriter.
El cliente lee la respuesta del servidor utilizando un BufferedReader.
5. Conclusiones

En este ejemplo, hemos creado un sistema cliente-servidor b ́asico en Java utilizando sockets TC-
P/IP. Hemos demostrado c ́omo configurar y utilizar un servidor para recibir conexiones entrantes, as ́ı

como c ́omo configurar y utilizar un cliente para conectarse al servidor y enviar datos. Este ejemplo
proporciona una base s ́olida para comprender la comunicaci ́on entre aplicaciones utilizando sockets en
Java.
