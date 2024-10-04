package ru.kolts.java.basic.homework13.lesson20.client;

import java.io.*;
import java.net.Socket;

public class PingClient implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public PingClient(Socket socket) throws IOException {
        outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    }

    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
    }

    public String read() throws IOException {
        return inputStream.readUTF();
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
        outputStream.close();
    }
}
