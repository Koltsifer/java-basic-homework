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

    public void info(){
        System.out.println(name + " - " + (fed ? "Сытый" : "Голодный"));
    }
}
