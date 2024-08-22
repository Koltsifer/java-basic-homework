package ru.kolts.java.basic.homework10.lesson16.collections;

import java.util.Objects;

public class FullName {
    private final String lastName;
    private final String firstName;
    private final String otchestvo;

    public FullName(String lastName, String firstName, String otchestvo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.otchestvo = otchestvo;
    }

    public FullName getFIOByName(String firstName){
        if (Objects.equals(this.firstName, firstName)){
            return this;
        }
        return null;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + otchestvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(lastName, fullName.lastName) && Objects.equals(firstName, fullName.firstName) && Objects.equals(otchestvo, fullName.otchestvo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, otchestvo);
    }
}
