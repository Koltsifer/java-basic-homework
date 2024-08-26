package ru.kolts.java.basic.homework07.lesson13.transport;

import ru.kolts.java.basic.homework07.lesson13.Terrain;

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