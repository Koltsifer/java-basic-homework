package ru.kolts.java.basic.oop.homework2.part3;

public class Human {
    private final String name;
    private Object currentTransport;

    public String getName() {
        return name;
    }

    public Object getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Object currentTransport) {
        this.currentTransport = currentTransport;
    }

    public Human(String name, Object currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }
}