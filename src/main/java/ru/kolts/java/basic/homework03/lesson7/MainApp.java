package ru.kolts.java.basic.homework03.lesson7;

import java.util.Scanner;
/**
 * Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
 * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
 * Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
 * символов * со сторонами соответствующей длины;
 * Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его
 * диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
 * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
 * Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
 * если второй строки не существует, то в качестве результата необходимо вернуть -1
 * Домашнее задание сдается через Pull Request
 */
public class MainApp {
    public static void part3() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int[][] arr = {{2, -2, 1, -2, 2}, {1, 1, 1, -2}};
        int[][] arrSquare = {{1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        int[][] smallArr1 = new int[1][1];
        int[][] smallArr2 = {{1, 2, 3}, {1}};

        while (running) {
            System.out.println("\nВведите номер задания 1 - 5. Чтобы вернуться введите x");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Задание 1:");
                    System.out.println("Сумма массива = " + sumOfPositiveElements(arr));
                    break;
                case "2":
                    System.out.println("Задание 2:");
                    drawSquare(5);
                    break;
                case "3":
                    System.out.println("Задание 3:");
                    makeDiagonalZero(arrSquare);
                    break;
                case "4":
                    System.out.println("Задание 4:");
                    System.out.println(findMax(arrSquare));
                    break;
                case "5":
                    System.out.println("Задание 5:");
                    System.out.println("Сумма второй строки/столбца = " + sumOfSecondLine(smallArr1));
                    System.out.println("Сумма второй строки/столбца = " + sumOfSecondLine(arrSquare));
                    System.out.println("Сумма второй строки/столбца = " + sumOfSecondLine(smallArr2));
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

    public static int sumOfPositiveElements(int[][] inputArr) {
        int sum = 0;
        for (int[] ints : inputArr) {
            for (int anInt : ints) {
                if (anInt > 0) {
                    sum += anInt;
                }
            }
        }
        return sum;
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void makeDiagonalZero(int[][] inputArr) {
        Scanner scanner = new Scanner(System.in);
        int counter;
        System.out.println("Зануление массива:\n" +
                "1. Сверху вниз\n" +
                "2. Снизу вверх\n" +
                "3. Оба варианта");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i][i] = 0;
                }
                break;
            case "2":
                counter = inputArr.length - 1;
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i][counter] = 0;
                    counter--;
                }
                break;
            case "3":
                counter = inputArr.length - 1;
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i][i] = 0;
                    inputArr[i][counter] = 0;
                    counter--;
                }
                break;
            default:
                System.out.println("Неверное значение!");
                break;
        }

        for (int[] ints : inputArr) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }

    //4. Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    //5. Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по
//вашему выбору), если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
    public static int sumOfSecondLine(int[][] inputArr) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("1. Сумма второй строки\n" +
                "2. Сумма второго столбца");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                if (inputArr.length < 2) {
                    return -1;
                } else {
                    for (int i = 0; i < inputArr[1].length; i++) {
                        sum += inputArr[1][i];
                    }
                }
                break;
            case "2":
                int min = inputArr.length;
                for (int[] ints : inputArr) {
                    if (ints.length < min) {
                        min = ints.length;
                    }
                }
                if (min < 2) {
                    return -1;
                } else {
                    for (int[] ints : inputArr) {
                        sum += ints[1];
                    }
                }
                break;
            default:
                System.out.println("Неверное значение!");
                break;
        }
        return sum;
    }
}