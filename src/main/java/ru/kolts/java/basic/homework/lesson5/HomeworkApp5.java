package ru.kolts.java.basic.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkApp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int[] a = {1, 2, 3};
        int[] b = {2, 4, 3, 6, 3};
        int[] c = {7, 7, 3, 1};

        while (running) {
            System.out.println("\nВведите номер задания 1 - 4. Для выхода введите x");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Задание 1");
                    arraysSum(a, b, c);
                    break;
                case "2":
                    System.out.println("Задание 2");
                    findMiddlePoint(a);
                    findMiddlePoint(b);
                    findMiddlePoint(c);
                    break;
                case "3":
                    System.out.println("Задание 3");
                    checkIfDescOrAsc(a);
                    checkIfDescOrAsc(b);
                    checkIfDescOrAsc(c);
                    break;
                case "4":
                    System.out.println("Задание 4");
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

    //1. Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
//массив равный сумме входящих;
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

    //2. Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
//равны. “Точка находится между элементами”;
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

    //3. Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
//возрастания (по выбору пользователя)
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
