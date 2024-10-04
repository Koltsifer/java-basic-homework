package ru.kolts.java.basic.homework13.lesson20.server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerApp {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("Ожидание подключения:");
            Socket clientAccepted = serverSocket.accept();
            System.out.println("Клиент подключен: " + clientAccepted.getInetAddress());
            while (true) {
                if (!clientAccepted.isClosed()) {
                    readRequest(clientAccepted);
                } else {
                    System.out.println("Клиент отключен.");
                    break;
                }
            }
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
             DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()))) {

            out.writeUTF("Доступные математические операции: +,-,*,/");
            out.flush();

            List<String> strings = List.of(in.readUTF().split(" "));
            double number1 = Double.parseDouble(strings.get(0));
            double number2 = Double.parseDouble(strings.get(1));
            double result = 0;

            switch (strings.get(2)) {
                case "/":
                    result = number1 / number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "+":
                    result = number1 + number2;
                    break;
                default:
                    break;
            }

            out.writeUTF(String.valueOf(result));
            out.flush();
        }
    }
}
