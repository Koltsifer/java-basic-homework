package ru.kolts.java.basic.homework05.lesson11.oop;
/**
 * Создайте классы Cat, Dog и Horse с наследованием от класса Animal
 * У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
 * Затраты выносливости:
 * Все животные на 1 метр бега тратят 1 ед выносливости,
 * Собаки на 1 метр плавания - 2 ед.
 * Лошади на 1 метр плавания тратят 4 единицы
 * Кот плавать не умеет.
 * Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на указанное
 * действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1 и указываем что
 * у животного появилось состояние усталости. При выполнении действий пишем сообщения в консоль.
 * Добавляем метод info(), который выводит в консоль состояние животного.
 */
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