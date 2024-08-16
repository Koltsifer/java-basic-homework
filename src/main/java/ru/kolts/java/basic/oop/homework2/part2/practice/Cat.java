package ru.kolts.java.basic.oop.homework2.part2.practice;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fed = false;
    }

    public void eatFromPlate(Plate plate) {
        if (!fed && plate.canDecrease(appetite)) {
            fed = true;
        }
    }

    @Override
    public String toString() {
        return name + " - " + (fed ? "Сытый" : "Голодный");
    }
}
