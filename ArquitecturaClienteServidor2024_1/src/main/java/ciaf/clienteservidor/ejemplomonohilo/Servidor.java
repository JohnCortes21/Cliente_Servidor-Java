package ciaf.clienteservidor.ejemplomonohilo;

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
         while (true) {
             System.out.println("-------------------------------------");
            System.out.println("Cliente conectado...");
             System.out.println("-------------------------------------");
            Socket socket = serverSocket.accept();

            int numThreads = 5;
            for (int i = 0; i< numThreads ; i++){
                ClienteHandler clienteHandler = new ClienteHandler(socket);
                Thread clienteThread = new Thread(clienteHandler);
                clienteThread.start();
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}