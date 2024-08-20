package ru.kolts.java.basic.part7.homework.transport;

import ru.kolts.java.basic.part7.homework.Terrain;

public interface Transport {
    boolean move(Terrain typeOfTerrain, int distance);
}