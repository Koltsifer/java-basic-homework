package ru.kolts.java.basic.oop.homework2.part3;

public class Cat {
    public String name;
    public int appetite;
    public boolean fed;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.fed = false;
    }

    @Override
    public String toString() {
        return name + " - " + (fed ? "Сытый" : "Голодный");
    }
}
