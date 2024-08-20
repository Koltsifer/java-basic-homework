package ru.kolts.java.basic.part5.oop.homework;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik", 3, 3, 5);
        Horse horse = new Horse("Hose", 1, 5, 10);
        Cat cat = new Cat("KisKis", 2, 3, 4);
        cat.info();
        cat.swim(1);
        dog.info();
        System.out.println("Затраченное на бег время: " + dog.run(2) + " (секунды)");
        dog.info();
        System.out.println("Затраченное на бег время: " + dog.run(10) + " (секунды)");
        horse.info();
        System.out.println("Затраченное на плаванье время: " + horse.swim(2) + " (секунды)");
    }
}
