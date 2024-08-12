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

    public void eat(Plate foodSource) {
        if (foodSource.decrease(appetite) && !fed) {
            foodSource.setCurrentFood(foodSource.getCurrentFood() - appetite);
            fed = true;
        }
    }

    @Override
    public String toString() {
        return name + " - " + (fed ? "Сытый" : "Голодный");
    }
}
