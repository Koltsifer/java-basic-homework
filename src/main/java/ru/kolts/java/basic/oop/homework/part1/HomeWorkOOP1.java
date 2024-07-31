package ru.kolts.java.basic.oop.homework.part1;

public class HomeWorkOOP1 {
    public static void main(String[] args) {
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
        box.pullItem();
        box.getInfo();
        box.open();
        box.pullItem();
        box.getInfo();
    }
}
