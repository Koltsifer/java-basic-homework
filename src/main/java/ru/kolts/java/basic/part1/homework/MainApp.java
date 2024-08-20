package ru.kolts.java.basic.part1.homework;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void part1() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Random random = new Random();

        while (running) {
            System.out.println("\nВведите номер задания 1 - 5. Чтобы вернуться введите x");
            String task = scanner.nextLine();
            switch (task) {
                case "1":
                    greetings();
                    break;
                case "2":
                    checkSign(
                            random.nextInt((1 + 1) + 1) - 1,
                            random.nextInt((1 + 1) + 1) - 1,
                            random.nextInt((1 + 1) + 1) - 1
                    );
                    break;
                case "3":
                    selectColor();
                    break;
                case "4":
                    compareNumbers();
                    break;
                case "5":
                    System.out.println("\nЗадание 5:");
                    System.out.println("Введите первое значение:");
                    int initValue = scanner.nextInt();
                    System.out.println("Введите второе значение:");
                    int delta = scanner.nextInt();
                    System.out.println("Выберите операцию - \"+\" или \"-\":");
                    boolean increment;
                    char operation = scanner.next().charAt(0);
                    if (operation == '+') {
                        increment = true;
                    } else if (operation == '-') {
                        increment = false;
                    } else {
                        System.out.println("Необходимо ввести + или -");
                        break;
                    }
                    addOrSubtractAndPrint(initValue, delta, increment);
                    scanner.nextLine();
                    break;
                case "x":
                case "х":
                case "X":
                case "Х":
                    running = false;
                    break;
                default:
                    System.out.println(task + " - Такое значение не принимается!");
            }
        }


    }

    public static void greetings() {
        System.out.println("\nЗадание 1:");
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        System.out.println("\nЗадание 2:");
        System.out.println("a = " + a + " | b = " + b + " | c = " + c);

        if (a + b + c >= 0)
            System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void selectColor() {
        System.out.println("\nЗадание 3:");
        Random random = new Random();
        int data = random.nextInt(30);

        if (data <= 10)
            System.out.println("Красный");
        else if (data <= 20)
            System.out.println("Желтый");
        else System.out.println("зелёный");
    }

    public static void compareNumbers() {
        System.out.println("\nЗадание 4:");
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println("a = " + a + " | b = " + b);

        if (a >= b)
            System.out.println("a >= b");
        else System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment)
            System.out.println("Результат: " + initValue + " + " + delta + " = " + (initValue + delta));
        else System.out.println("Результат: " + initValue + " - " + delta + " = " + (initValue - delta));
    }
}
