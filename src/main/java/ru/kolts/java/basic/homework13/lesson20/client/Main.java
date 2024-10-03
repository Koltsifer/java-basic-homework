package ru.kolts.java.basic.homework13.lesson20.client;

import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Сервер: выполняет математические вычисления: +,-,*,/
 * <p>
 * Клиент-серверное взаимодействие:
 * <p>
 * клиент подключается к серверу, получает строку с доступными мат. операциями. Отображает ее пользователю.
 * <p>
 * пользователь вводит два числа и команду в консоль
 * <p>
 * отправляется запрос на сервер, сервер выполняет вычисления, возвращает результат клиенту.
 * <p>
 * клиент отображает результат в консоль
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        try (Socket socket = new Socket("localhost", 8888);
             PingClient pingClient = new PingClient(socket)
        ) {
            pingClient.send(userInput.getBytes(StandardCharsets.UTF_8));
            System.out.println(pingClient.read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
