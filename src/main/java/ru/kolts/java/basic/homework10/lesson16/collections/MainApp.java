package ru.kolts.java.basic.homework10.lesson16.collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;<p>
 * Метод add() должен позволять добавлять запись имя-телефон;<p>
 * Метод find() выполнять поиск номер(-а, -ов) телефона по имени;<p>
 * Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека
 * нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;<p>
 * Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
 */
public class MainApp {
    public static void main(String[] args) {
        PhoneBook list = new PhoneBook();
        add(list, "Иванов Егор Георгиевич", "80001110011");
        add(list, "Иванов Егор Георгиевич", "80002220022");
        add(list, "Иванов Дамир Макарович", "80002220022");
        add(list, "Сидорова Есения Мироновна", "80196660986");
        add(list, "Егорова Айлин Ильинична", "81447119287");
        add(list, "Соловьева Маргарита Михайловна", "84872939006");
        add(list, "Соловьева Екатерина Никитична", "85276340071");
        add(list, "Грачева Мария Всеволодовна", "89378106040");
        add(list, "Соловьева Ксения Степановна", "85756888699");
        add(list, "Лукьянова Алиса Михайловна", "87261513750");
        add(list, "Белова Ева Артёмовна", "86534226480");
        printList(list);

        find(list, "Иванов Егор Георгиевич");
        find(list, "Иванов");

        System.out.println(containsPhoneNumber(list, "12354"));
        System.out.println(containsPhoneNumber(list, "86534226480"));
    }

    public static void add(PhoneBook phoneBook, String fio, String phone) {
        String[] arrayFIO = fio.split(" ");
        if (arrayFIO.length != 3) {
            System.out.println("Необходимо указать ФИО формата: \"Фамилия Имя Отчество\"");
            return;
        }
        FullName newFio = new FullName(arrayFIO[0], arrayFIO[1], arrayFIO[2]);
        Set<String> newPhone = new HashSet<>();
        newPhone.add(phone);
        if (phoneBook.getList().containsKey(newFio)) {
            phoneBook.getList().get(newFio).add(phone);
        } else {
            phoneBook.getList().put(newFio, newPhone);
        }
    }

    public static void find(PhoneBook phoneBook, String name) {
        System.out.println("По значению \"" + name + "\" найден(-ы) номер(-а):");
        boolean isThereAnyNumbers = false;
        for (Map.Entry<FullName, Set<String>> element : phoneBook.getList().entrySet()) {
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

    public static boolean containsPhoneNumber(PhoneBook phoneBook, String phone) {
        for (Map.Entry<FullName, Set<String>> element : phoneBook.getList().entrySet()) {
            if (element.getValue().contains(phone)) {
                return element.getValue().contains(phone);
            }
        }
        return false;
    }

    public static void printList(PhoneBook phoneBook) {
        for (Map.Entry<FullName, Set<String>> element : phoneBook.getList().entrySet()) {
            System.out.println("ФИО: \"" + element.getKey() + "\" Телефон: " + element.getValue());
        }
    }
}