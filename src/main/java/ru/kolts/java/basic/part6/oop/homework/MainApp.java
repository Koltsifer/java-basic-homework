package ru.kolts.java.basic.part6.oop.homework;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 1),
                new Cat("Сахар", 2),
                new Cat("Коржик", 2),
                new Cat("Батон", 4),
                new Cat("Собака", 1),
                new Cat("Чешир", 2),
                new Cat("Живоглот", 5)
        };
        Plate plate = new Plate(15);

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        for (Cat cat : cats) {
            cat.eatFromPlate(plate);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.addFood(10);
        plate.addFood(50);
        plate.addFood(-10);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eatFromPlate(plate);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
