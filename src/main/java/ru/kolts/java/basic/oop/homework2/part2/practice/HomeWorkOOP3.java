package ru.kolts.java.basic.oop.homework2.part2.practice;

public class HomeWorkOOP3 {
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
            cat.fed = plate.feed(cat.appetite, cat.fed);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        plate.addFood(10);
        plate.addFood(50);
        plate.addFood(-10);
        for (Cat cat : cats) {
            cat.fed = plate.feed(cat.appetite, cat.fed);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
