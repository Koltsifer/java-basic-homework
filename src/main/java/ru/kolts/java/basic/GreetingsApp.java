package ru.kolts.java.basic;

import java.util.Scanner;

import static ru.kolts.java.basic.homework1.lesson3.HomeworkApp3.lesson3;
import static ru.kolts.java.basic.homework1.lesson5.HomeworkApp5.lesson5;
import static ru.kolts.java.basic.homework1.lesson7.HomeWorkApp7.lesson7;
import static ru.kolts.java.basic.oop.homework2.part1.HomeWorkOOP1.oopPart1;

public class GreetingsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nВведите номер занятия (1-4). Для выхода введите x");
            String lesson = scanner.nextLine();
            switch (lesson) {
                case "1":
                    lesson3();
                    break;
                case "2":
                    lesson5();
                    break;
                case "3":
                    lesson7();
                    break;
                case "4":
                    oopPart1();
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
