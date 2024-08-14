package ru.kolts.java.basic.oop.homework2.part3.transport;

import ru.kolts.java.basic.oop.homework2.part3.Terrain;

import static ru.kolts.java.basic.oop.homework2.part3.Terrain.*;

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