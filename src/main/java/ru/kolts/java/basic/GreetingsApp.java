package ru.kolts.java.basic;

import java.util.Scanner;

import static ru.kolts.java.basic.homework1.lesson3.MainApp.part1;
import static ru.kolts.java.basic.homework2.lesson5.MainApp.part2;
import static ru.kolts.java.basic.homework3.lesson7.MainApp.part3;
import static ru.kolts.java.basic.homework4.lesson9.oop.MainApp.part4;

public class GreetingsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nВведите номер занятия (1-4). Для выхода введите x");
            String lesson = scanner.nextLine();
            switch (lesson) {
                case "1":
                    part1();
                    break;
                case "2":
                    part2();
                    break;
                case "3":
                    part3();
                    break;
                case "4":
                    part4();
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