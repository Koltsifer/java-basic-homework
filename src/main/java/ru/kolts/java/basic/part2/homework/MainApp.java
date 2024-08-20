package ru.kolts.java.basic.part2.homework;

import java.util.Arrays;
import java.util.Scanner;
/**
 * (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
 * (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен
 * посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
 * в противном случае - “Сумма отрицательная”;
 * (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
 * Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
 * если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
 * (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми
 * начальными значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
 * в противном случае “a < b”;
 * (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true,
 * то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
 * Каждый метод последовательно вызовите из метода main();
 * (*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод,
 * соответствующий указанному номеру со случайным значением аргументов;
 * Домашнее задание сдается через Pull Request!
 */
public class MainApp {
    public static void part2() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int[] a = {1, 2, 3};
        int[] b = {2, 4, 3, 6, 3};
        int[] c = {7, 7, 3, 1};

        while (running) {
            System.out.println("\nВведите номер задания 1 - 4. Чтобы вернуться введите x");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Задание 1:");
                    arraysSum(a, b, c);
                    break;
                case "2":
                    System.out.println("Задание 2:");
                    findMiddlePoint(a);
                    findMiddlePoint(b);
                    findMiddlePoint(c);
                    break;
                case "3":
                    System.out.println("Задание 3:");
                    checkIfDescOrAsc(a);
                    checkIfDescOrAsc(b);
                    checkIfDescOrAsc(c);
                    break;
                case "4":
                    System.out.println("Задание 4:");
                    reverseArray(a);
                    reverseArray(b);
                    reverseArray(c);
                    break;
                case "x":
                case "х":
                case "X":
                case "Х":
                    running = false;
                    break;
                default:
                    System.out.println("Неверное значение!");
                    break;
            }
        }
    }

    public static void arraysSum(int[]... a) {
        int max = 0;
        for (int[] arr : a) {
            max = Math.max(max, arr.length);
        }
        int[] result = new int[max];
        for (int[] i : a) {
            for (int j = 0; j < i.length; j++) {
                result[j] += i[j];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void findMiddlePoint(int[] inputArr) {
        int maxSum = 0;
        int sum = 0;

        for (int i : inputArr) {
            maxSum += i;
        }
        for (int i = 0; i < inputArr.length - 1; i++) {
            sum += inputArr[i];
            if (sum == maxSum / 2) {
                System.out.println("Точка находится между элементами: [" + i + "] и [" + (i + 1) + "]");
                return;
            }
        }
        System.out.println("Между элементами нет точки.");
    }

    public static void checkIfDescOrAsc(int[] inputArr) {
        boolean desc = true;
        boolean asc = true;
        for (int i = 0; i < inputArr.length - 1; i++) {
            if (inputArr[i] < inputArr[i + 1]) {
                asc = false;
            }
            if (inputArr[i] > inputArr[i + 1]) {
                desc = false;
            }
        }
        if (desc ^ asc) {
            if (desc) {
                System.out.println("Элементы массива идут в порядке возрастания");
            } else {
                System.out.println("Элементы массива идут в порядке убывания");
            }
        } else {
            System.out.println("Элементы массива идут в случайном порядке");
        }
    }

    //4. Реализуйте метод, “переворачивающий” входящий массив
//Пример: { 1 2 3 4 } => { 4 3 2 1 }
    public static void reverseArray(int[] inputArr) {
        for (int i = 0; i < inputArr.length / 2; i++) {
            int temp = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - (i + 1)];
            inputArr[inputArr.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(inputArr));
    }
}
