package ru.kolts.java.basic.oop.homework2.part2.practice;

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
