package ru.kolts.java.basic.homework5.lesson11.oop;

abstract class Animal {
    protected String name;
    protected int swimSpeed; //м/с
    protected int runSpeed; //м/с
    protected int endurance;

    public void info() {
        System.out.println("\nИмя: " + name);
        System.out.println("Скорость плавания: " + swimSpeed + " м/с");
        System.out.println("Скорость бега: " + runSpeed + " м/с");
        System.out.println("Выносливость: " + endurance + "у.е.\n");
    }

    public float run(int distance) {
        if ((endurance - distance) >= 0) {
            endurance -= distance;
            System.out.println("Животное побежало");
            return (float) distance / runSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
    }

    public float swim(int distance) {
        if (this instanceof Cat) {
            System.out.println("Кот не умеет плавать!");
            return -1;
        } else if (this instanceof Horse) {
            if ((endurance - (distance * 4)) >= 0) {
                endurance -= (distance * 4);
                System.out.println("Животное поплыло");
                return (float) distance / swimSpeed;
            }
        } else if (this instanceof Dog) {
            if ((endurance - (distance * 2)) >= 0) {
                endurance -= (distance * 2);
                System.out.println("Животное поплыло");
                return (float) distance / swimSpeed;
            }
        }
        System.out.println("Животное устало");
        return -1;
    }
}