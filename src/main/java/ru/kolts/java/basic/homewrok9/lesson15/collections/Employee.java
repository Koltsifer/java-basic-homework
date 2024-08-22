package ru.kolts.java.basic.homewrok9.lesson15.collections;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<String> returnOnlyNamesList(List<Employee> list) {
        List<String> newList = new ArrayList<>();
        for (Employee employee : list) {
            newList.add(employee.name);
        }
        return newList;
    }

    public static List<Employee> trimEmployeeListByAge(List<Employee> list, int minAge) {
        List<Employee> newList = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.age >= minAge) {
                newList.add(employee);
            }
        }
        return newList;
    }

    public static boolean isAgeAverageInList(List<Employee> list, int averageAge) {
        int average = 0;
        for (Employee employee : list) {
            average += employee.age;
        }
        return average / list.size() > averageAge;
    }

    public static Employee returnYoungest(List<Employee> list) {
        int smallestAge = Integer.MAX_VALUE;
        Employee youngest = null;
        for (Employee employee : list) {
            if (employee.age < smallestAge) {
                smallestAge = employee.age;
                youngest = employee;
            }
        }
        return youngest;
    }

    @Override
    public String toString() {
        return "Сотрудник: Имя - \"" + name + "\" | Возраст - " + age;
    }
}