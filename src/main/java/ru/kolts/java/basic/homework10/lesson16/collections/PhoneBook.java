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

    public Map<FullName, Set<String>> getList() {
        return list;
    }
}