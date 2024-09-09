package ru.kolts.java.basic.homework11.lesson17;

import java.util.Objects;

public class Person {
    private String name;
    private Position position;
    private final Long id;
    private static long counter = 0;

    public Person(String name, Position position) {
        this.name = name;
        this.position = position;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && position == person.position && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, id);
    }
}