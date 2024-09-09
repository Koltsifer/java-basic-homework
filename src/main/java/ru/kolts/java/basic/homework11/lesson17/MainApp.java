package ru.kolts.java.basic.homework11.lesson17;

import static ru.kolts.java.basic.homework11.lesson17.Position.*;

/**
 * Даны класс Person и enum Position
 * <p>
 * public class Person {
 * String name;
 * Position position;
 * Long id;
 * }
 * <p>
 * public enum Position {
 * MANAGER, DIRECTOR, DRIVER, ENGINEER, SENIOR_MANAGER, DEVELOPER, QA,
 * JANITOR, PLUMBER, BRANCH_DIRECTOR, JUNIOR_DEVELOPER
 * }
 * <p>
 * Реализуйте класс PersonDataBase, содержащий список Person, и имеющий методы, со следующей асимптотической сложностью
 * (методы и конструктор класса Person реализовать самостоятельно)
 * <p>
 * - Person findById(Long id) - найти Person по id - O(1)
 * <p>
 * - void add(Person person) - добавить Person - O(1)
 * <p>
 * - isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
 * <p>
 * - isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position
 */
public class MainApp {
    public static void main(String[] args) {
        PersonDataBase personDB = new PersonDataBase();
        personDB.add(new Person("DIMA", MANAGER));
        personDB.add(new Person("OLEG", DIRECTOR));
        personDB.add(new Person("ALEX", DRIVER));
        personDB.add(new Person("FRED", ENGINEER));
        personDB.add(new Person("JON", SENIOR_MANAGER));
        personDB.add(new Person("SAM", DEVELOPER));
        personDB.add(new Person("BILL", QA));
        personDB.add(new Person("FILL", JANITOR));
        personDB.add(new Person("GREG", PLUMBER));
        personDB.add(new Person("BOB", BRANCH_DIRECTOR));
        personDB.add(new Person("SAM", JUNIOR_DEVELOPER));
        personDB.add(null);

        System.out.println(personDB.isManager(personDB.findById(2L)));

        System.out.println(personDB.isEmployee(2L));
    }
}