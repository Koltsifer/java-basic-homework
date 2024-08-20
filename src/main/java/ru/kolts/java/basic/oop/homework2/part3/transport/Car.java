package ru.kolts.java.basic.oop.homework2.part3.transport;

import ru.kolts.java.basic.oop.homework2.part3.Terrain;

import static ru.kolts.java.basic.oop.homework2.part3.Terrain.*;

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
