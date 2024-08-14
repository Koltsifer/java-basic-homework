package ru.kolts.java.basic.oop.homework2.part3.transport;

import ru.kolts.java.basic.oop.homework2.part3.Terrain;

public class ATV implements Transport {
    private int fuel;

    public ATV(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrain typeOfTerrain, int distance) {
        if (distance > fuel || distance <= 0) {
            return false;
        }
        fuel -= distance;
        return true;
    }

    @Override
    public String toString() {
        return "Вездеход (" + fuel + ")";
    }
}
