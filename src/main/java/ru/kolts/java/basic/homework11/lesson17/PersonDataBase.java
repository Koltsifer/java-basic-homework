package ru.kolts.java.basic.homework11.lesson17;

import java.util.*;

import static ru.kolts.java.basic.homework11.lesson17.Position.*;

public class PersonDataBase {
    private final Map<Long, Person> personDB;

    public PersonDataBase() {
        personDB = new HashMap<>();
    }

    public Person findById(Long id) {
        return personDB.get(id);
    }

    public void add(Person person) {
        if (person == null) {
            return;
        }
        personDB.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        if (person == null) {
            return false;
        }
        Position pos = person.getPosition();
        return pos == MANAGER || pos == DIRECTOR || pos == BRANCH_DIRECTOR || pos == SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        Person person = findById(id);
        if (person == null) {
            return false;
        }
        Position pos = person.getPosition();
        return pos != MANAGER && pos != DIRECTOR && pos != BRANCH_DIRECTOR && pos != SENIOR_MANAGER;
    }
}