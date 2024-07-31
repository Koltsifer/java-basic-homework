package ru.kolts.java.basic.oop.homework.part1;

import java.time.Year;

public class User {

//    Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;

//    Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;

//    В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//    ФИО: фамилия имя отчество
//    Год рождения: год рождения
//    e-mail: email

//    В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла
//    выведите информацию только о пользователях старше 40 лет.

//    Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно
//    открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
//    У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
//    (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии
//    что коробка открыта (предметом читаем просто строку). Выполнение методов должно сопровождаться выводом
//    сообщений в консоль.

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final int birthYear;
    private final String email;

    public User(String lastName,String firstName,String middleName, int birthYear, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public int getAge(){
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void getInfo(){
        System.out.println("\nФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }
}
