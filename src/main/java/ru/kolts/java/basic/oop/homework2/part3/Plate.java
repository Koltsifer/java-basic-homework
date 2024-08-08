package ru.kolts.java.basic.oop.homework2.part3;

public class Plate {
    public int currentFood;
    public int maxFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        if ((currentFood + amount) <= maxFood && amount > 0) {
            currentFood += amount;
            System.out.println("В тарелке лежит: " + currentFood + "/" + maxFood);
        } else {
            System.out.println("Столько нельзя положить в тарелку!");
            System.out.println("В тарелке лежит: " + currentFood + "/" + maxFood);
            System.out.println("Вы пытаетесь положить: " + amount);
        }
    }

    public boolean feed(int appetite, boolean fed) {
        if ((currentFood - appetite) >= 0 && !fed) {
            currentFood -= appetite;
            return currentFood >= 0;
        }
        return fed;
    }
}
