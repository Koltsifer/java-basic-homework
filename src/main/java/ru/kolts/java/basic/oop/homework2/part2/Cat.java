package ru.kolts.java.basic.oop.homework2.part2;

public class Cat extends Animal {
    public Cat(String name, int swimSpeed, int runSpeed, int endurance) {
        this.name = name;
        this.swimSpeed = swimSpeed;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    @Override
    float swim(int distance) {
        System.out.println("Кот не умеет плавать!");
        return -1;
    }
}
