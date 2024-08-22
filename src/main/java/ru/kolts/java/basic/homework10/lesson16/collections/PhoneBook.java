package ru.kolts.java.basic.homework10.lesson16.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;<p>
 * Метод add() должен позволять добавлять запись имя-телефон;<p>
 * Метод find() выполнять поиск номер(-а, -ов) телефона по имени;<p>
 * Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека
 * нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;<p>
 * Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
 */
public class PhoneBook {
    private Map<FullName, String> list;

    public PhoneBook() {
        this.list = new HashMap<>();
    }

    public FullName getFIO() {
        return (FullName) list.keySet();
    }

    public void add(String FIO, String phone) {
        String[] arrayFIO = FIO.split(" ");
        if (arrayFIO.length != 3) {
            System.out.println("Необходимо указать ФИО формата: \"Фамилия Имя Отчество\"");
            return;
        }
        FullName newFio = new FullName(arrayFIO[0], arrayFIO[1], arrayFIO[2]);
        list.put(newFio, phone);
    }

    public String findPhoneByName(String name){
        return list.get(getFIO().getFIOByName(name));
    }

    public void printList() {
        for (Map.Entry<FullName, String> element : list.entrySet()) {
            System.out.println("ФИО: \"" + element.getKey() + "\" Телефон: " + element.getValue());
        }
    }
}
