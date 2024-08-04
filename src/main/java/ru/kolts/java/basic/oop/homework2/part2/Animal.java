package ru.kolts.java.basic.oop.homework2.part2;

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

    abstract float swim(int distance);
}
