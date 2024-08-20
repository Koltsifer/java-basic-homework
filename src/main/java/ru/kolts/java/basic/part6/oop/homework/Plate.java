package ru.kolts.java.basic.part6.oop.homework;

public class Plate {
    private int currentFood;
    private final int maxFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        if ((currentFood + amount) <= maxFood && amount > 0) {
            currentFood += amount;
            System.out.println("Вы положили в тарелку: " + amount + " | " + currentFood + "/" + maxFood);
        } else {
            System.out.println("Столько нельзя положить в тарелку! (" + amount + ") | " + currentFood + "/" + maxFood);
        }
    }

    public boolean canDecrease(int appetite) {
        if (currentFood - appetite >= 0) {
            currentFood -= appetite;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Тарелка: " + currentFood + "/" + maxFood;
    }
}
