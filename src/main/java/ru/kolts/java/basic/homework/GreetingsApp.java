package ru.kolts.java.basic.homework;

import java.util.Scanner;

import static ru.kolts.java.basic.homework.lesson3.HomeworkApp3.lesson3;
import static ru.kolts.java.basic.homework.lesson5.HomeworkApp5.lesson5;

public class GreetingsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nВведите номер занятия (3, 5). Для выхода введите x");
            String lesson = scanner.nextLine();
            switch (lesson) {
                case "3":
                    lesson3();
                    break;
                case "5":
                    lesson5();
                    break;
                case "x":
                case "х":
                case "X":
                case "Х":
                    running = false;
                    break;
                default:
                    System.out.println(lesson + " - Такое значение не принимается!");
            }
        }
    }
}
