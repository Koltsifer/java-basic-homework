package ru.kolts.java.basic.part7.homework.transport;

import ru.kolts.java.basic.part7.homework.Terrain;

import static ru.kolts.java.basic.part7.homework.Terrain.*;

public class Bicycle implements Transport {
    @Override
    public boolean move(Terrain typeOfTerrain, int distance) {
        return typeOfTerrain != SWAMP;
    }

    @Override
    public String toString() {
        return "Велосипед";
    }
}