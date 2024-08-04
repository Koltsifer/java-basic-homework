package ru.kolts.java.basic.oop.homework2.part2;

public class Dog extends Animal {
    public Dog(String name, int swimSpeed, int runSpeed, int endurance) {
        this.name = name;
        this.swimSpeed = swimSpeed;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    @Override
    float swim(int distance) {
        if ((endurance - (distance * 2)) >= 0) {
            endurance -= (distance * 2);
            System.out.println("Животное поплыло");
            return (float) distance / swimSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
    }
}
