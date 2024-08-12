package ru.kolts.java.basic.oop.homework2.part2.practice;

public class Plate {
    private int currentFood;
    private final int maxFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void setCurrentFood(int currentFood) {
        if (currentFood >= 0 || currentFood <= maxFood) {
            this.currentFood = currentFood;
        } else {
            System.out.println("В тарелке не может быть столько: " + currentFood);
        }
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void addFood(int amount) {
        if ((currentFood + amount) <= maxFood && amount > 0) {
            currentFood += amount;
            System.out.println("Вы положили в тарелку: " + amount + " | " + currentFood + "/" + maxFood);
        } else {
            System.out.println("Столько нельзя положить в тарелку! (" + amount + ") | " + currentFood + "/" + maxFood);
        }
    }

    public boolean decrease(int appetite) {
        return currentFood - appetite >= 0;
    }
}
