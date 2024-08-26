package ru.kolts.java.basic.homework07.lesson13.transport;

import ru.kolts.java.basic.homework07.lesson13.Terrain;

import static ru.kolts.java.basic.homework07.lesson13.Terrain.*;

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