package ru.kolts.java.basic.homework13.lesson20.server;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while(true){
            Socket clientSocket = serverSocket.accept();
            readRequest(clientSocket);
            System.out.println("done");
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        String str = inputStream.readUTF();
        System.out.println(str);
        //что-то делаем
        socket.getOutputStream().write(str.getBytes(StandardCharsets.UTF_8));
    }
}
