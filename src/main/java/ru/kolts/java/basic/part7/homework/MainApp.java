package ru.kolts.java.basic.part7.homework;

import ru.kolts.java.basic.part7.homework.transport.*;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Олег");
        Transport[] transports = {
                new Car(100),
                new ATV(100),
                new Bicycle(),
                new Horse(100)
        };

        for (Transport tr : transports) {
            human.getIn(tr);
            for (Terrain terr : Terrain.values()) {
                System.out.println(human + terr.name() + (human.move(terr, 50) ? " Проехал!" : " Не проехал!"));
            }
            human.getOut();
        }

        for (Terrain terr : Terrain.values()) {
            System.out.println(human + terr.name() + (human.move(terr, 50) ? " Прошёл!" : " Не прошёл!"));
        }
    }
}
