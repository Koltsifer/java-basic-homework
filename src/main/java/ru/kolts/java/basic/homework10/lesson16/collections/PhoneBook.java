package ru.kolts.java.basic.homework10.lesson16.collections;

import java.util.*;

/**
 * 1. Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;<p>
 * 2. Метод add() должен позволять добавлять запись имя-телефон;<p>
 * 3. Метод find() выполнять поиск номер(-а, -ов) телефона по имени;<p>
 * (Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека
 * нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;)<p>
 * 4. Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
 */
public class PhoneBook {
    private final Map<FullName, Set<String>> list;

    public PhoneBook() {
        this.list = new HashMap<>();
    }

    public void add(String FIO, String phone) {
        String[] arrayFIO = FIO.split(" ");
        if (arrayFIO.length != 3) {
            System.out.println("Необходимо указать ФИО формата: \"Фамилия Имя Отчество\"");
            return;
        }
        FullName newFio = new FullName(arrayFIO[0], arrayFIO[1], arrayFIO[2]);
        Set<String> newPhone = new HashSet<>();
        newPhone.add(phone);
        if (list.containsKey(newFio)) {
            list.get(newFio).add(phone);
        } else {
            list.put(newFio, newPhone);
        }
    }

    public void find(String name) {
        System.out.println("По значению \"" + name + "\" найден(-ы) номер(-а):");
        boolean isThereAnyNumbers = false;
        for (Map.Entry<FullName, Set<String>> element : list.entrySet()) {
            if (Objects.equals(element.getKey().getLastName(), name) ||
                    Objects.equals(element.getKey().toString(), name)) {
                System.out.println(element.getValue());
                isThereAnyNumbers = true;
            }
        }
        if (!isThereAnyNumbers) {
            System.out.println("Номера не найдены.");
        }
    }

    public boolean containsPhoneNumber(String phone) {
        for (Map.Entry<FullName, Set<String>> element : list.entrySet()) {
            if (element.getValue().contains(phone)) {
                return element.getValue().contains(phone);
            }
        }
        return false;
    }

    public void printList() {
        for (Map.Entry<FullName, Set<String>> element : list.entrySet()) {
            System.out.println("ФИО: \"" + element.getKey() + "\" Телефон: " + element.getValue());
        }
    }
}