package ru.kolts.java.basic.homework07.lesson13.transport;

import ru.kolts.java.basic.homework07.lesson13.Terrain;

public interface Transport {
    boolean move(Terrain typeOfTerrain, int distance);
}