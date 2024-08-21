package ru.kolts.java.basic.homework7.lesson13.transport;

import ru.kolts.java.basic.homework7.lesson13.Terrain;

import static ru.kolts.java.basic.homework7.lesson13.Terrain.*;

public class Horse implements Transport {
    private int endurance;

    public Horse(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public boolean move(Terrain typeOfTerrain, int distance) {
        if (typeOfTerrain == SWAMP || distance > endurance || distance <= 0) {
            return false;
        }
        endurance -= distance;
        return true;
    }

    @Override
    public String toString() {
        return "Лошадь (" + endurance + ")";
    }
}