package ru.kolts.java.basic.part4.oop.homework;
/**
 * Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
 * Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
 * В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
 * ФИО: фамилия имя отчество
 * Год рождения: год рождения
 * e-mail: email
 * В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла
 * выведите информацию только о пользователях старше 40 лет.
 * Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно
 * открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя. У коробки
 * должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать
 * предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
 * только при условии что коробка открыта (предметом читаем просто строку).
 * Выполнение методов должно сопровождаться выводом сообщений в консоль.
 */
public class MainApp {
    public static void part4() {
        User[] users = {
                new User("Xavier", "Robert", "Kelly", 1920, "unknown"),
                new User("Jesus", "Isaac", "Wilson", 1983, "unknown"),
                new User("Christopher", "Jacob", "Powell", 1985, "unknown"),
                new User("William", "Wyatt", "Wilson", 1999, "unknown"),
                new User("Antonio", "Sean", "Barnes", 2000, "unknown"),
                new User("John", "Diego", "Hill", 2012, "unknown"),
                new User("Austin", "Gabriel", "Adams", 2003, "unknown"),
                new User("Sebastian", "Alejandro", "Sanders", 1984, "unknown"),
                new User("Joseph", "Anthony", "Rodriguez", 2012, "unknown"),
                new User("Isaac", "Seth", "Hall", 2014, "unknown"),
        };
        for (User user : users) {
            if (user.getAge() > 40) {
                user.getInfo();
            }
        }

        Box box = new Box(10, "red");
        box.getInfo();
        box.setColor("green");
        box.putItem("Нога");
        box.closed();
        box.closed();
        box.pullItem();
        box.getInfo();
        box.open();
        box.open();
        box.pullItem();
        box.getInfo();
    }
}
