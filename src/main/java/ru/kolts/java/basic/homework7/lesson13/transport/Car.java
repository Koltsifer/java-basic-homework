package ru.kolts.java.basic.homework7.lesson13.transport;

import ru.kolts.java.basic.homework7.lesson13.Terrain;

import static ru.kolts.java.basic.homework7.lesson13.Terrain.*;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrain typeOfTerrain, int distance) {
        if (typeOfTerrain == SWAMP || typeOfTerrain == DENSE_FOREST || distance > fuel || distance <= 0) {
            return false;
        }
        fuel -= distance;
        return true;
    }

    @Override
    public String toString() {
        return "Машина (" + fuel + ")";
    }
}