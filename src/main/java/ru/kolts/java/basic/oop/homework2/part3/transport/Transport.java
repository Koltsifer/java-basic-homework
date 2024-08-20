package ru.kolts.java.basic.oop.homework2.part3.transport;

import ru.kolts.java.basic.oop.homework2.part3.Terrain;

public interface Transport {
    boolean move(Terrain typeOfTerrain, int distance);
}