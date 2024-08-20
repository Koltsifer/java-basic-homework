package ru.kolts.java.basic.oop.homework2.part3;

import ru.kolts.java.basic.oop.homework2.part3.transport.Transport;

public class Human {
    private final String name;
    private Transport transport;

    public Human(String name) {
        this.name = name;
        this.transport = null;
    }

    public void getIn(Transport transport) {
        if (this.transport == null) {
            this.transport = transport;
            System.out.println("Человек использует транспорт: " + transport);
        } else {
            System.out.println("Сначала выйдите из транспорта.");
        }
    }

    public void getOut() {
        if (transport != null) {
            this.transport = null;
            System.out.println("Человек покинул транспорт.");
        } else {
            System.out.println("Человек уже пешком.");
        }
    }

    public boolean move(Terrain typeOfTerrain, int distance) {
        if (transport == null) {
            return true;
        }
        return transport.move(typeOfTerrain, distance);
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Транспорт: " + (transport == null ? "пешком. " : (transport + " "));
    }
}