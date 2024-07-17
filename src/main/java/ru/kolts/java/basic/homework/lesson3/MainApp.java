package ru.kolts.java.basic.homework.lesson3;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    //    Каждый метод последовательно вызовите из метода main();
    //    (*) При запуске приложения, запросите у пользователя число от 1 до 5,
    //    и после ввода выполнения метод, соответствующий указанному номеру со случайным
    //    значением аргументов;
    //    Домашнее задание сдается через Pull Request!
    public static void lesson3() {
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
                    // В аргументах рандомный диапазон чисел от 1 до -1
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
                    System.out.println("\nМетод 5:");
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

    //    (1) Реализуйте метод greetings(), который при вызове должен
    //    отпечатать в столбец 4 слова: Hello, World, from, Java;
    public static void greetings() {
        System.out.println("\nМетод 1:");
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //    (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов
    //    3 int переменные a, b и c. Метод должен посчитать их сумму,
    //    и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    //    в противном случае - “Сумма отрицательная”;
    public static void checkSign(int a, int b, int c) {
        System.out.println("\nМетод 2:");
        System.out.println("a = " + a + " | b = " + b + " | c = " + c);

        if (a + b + c >= 0)
            System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    //    (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с
    //    любым начальным значением. Если data меньше 10 включительно, то в консоль должно быть
    //    выведено сообщение “Красный”, если от 10 до 20 включительно, то “Желтый”,
    //    если больше 20 - “Зеленый”;
    public static void selectColor() {
        System.out.println("\nМетод 3:");
        Random random = new Random();
        int data = random.nextInt(30);

        if (data <= 10)
            System.out.println("Красный");
        else if (data <= 20)
            System.out.println("Желтый");
        else System.out.println("зелёный");
    }

    //    (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные
    //    a и b с любыми начальными значениями. Если a больше или равно b,
    //    то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        System.out.println("\nМетод 4:");
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println("a = " + a + " | b = " + b);

        if (a >= b)
            System.out.println("a >= b");
        else System.out.println("a < b");
    }

    //    (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    //    Если increment = true, то метод должен к initValue прибавить delta и отпечатать в
    //    консоль результат, в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment)
            System.out.println("Результат: " + initValue + " + " + delta + " = " + (initValue + delta));
        else System.out.println("Результат: " + initValue + " - " + delta + " = " + (initValue - delta));
    }
}
