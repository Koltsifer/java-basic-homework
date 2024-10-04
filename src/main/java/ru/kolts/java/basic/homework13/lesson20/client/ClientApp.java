package ru.kolts.java.basic.homework13.lesson20.client;

import ru.kolts.java.basic.homework13.lesson20.Utils;

import java.net.Socket;
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

public class ClientApp {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888);
             PingClient pingClient = new PingClient(socket);
             Scanner scanner = new Scanner(System.in)
        ) {
            String serverMsg = pingClient.read();
            StringBuilder str = new StringBuilder();
            String userInput;
            while (true) {
                System.out.println(serverMsg);
                System.out.println("Введите первое число:");
                if (Utils.isNumeric(userInput = scanner.nextLine())) {
                    str.append(userInput).append(" ");
                } else break;

                System.out.println("Введите второе число:");
                if (Utils.isNumeric(userInput = scanner.nextLine())) {
                    str.append(userInput).append(" ");
                } else break;

                System.out.println("Введите операцию:");
                if (Utils.isOperation(userInput = scanner.nextLine())) {
                    str.append(userInput);
                } else break;

                pingClient.send(str.toString());
                System.out.println("Результат: " + pingClient.read() + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
