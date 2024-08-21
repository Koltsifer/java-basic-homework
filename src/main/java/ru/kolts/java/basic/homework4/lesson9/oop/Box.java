package ru.kolts.java.basic.homework4.lesson9.oop;

public class Box {
    private final int size;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.isOpen = true;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getInfo() {
        System.out.println("\nРазмер коробки: " + size);
        System.out.println("Цвет коробки: " + color);
        System.out.println(isOpen ? "Коробка открыта." : "Коробка закрыта.");
        System.out.println("В коробке лежит: " + (item == null ? "Ничего." : item));
    }

    public void putItem(String item) {
        if (isOpen) {
            if (this.item == null) {
                this.item = item;
                System.out.println("\nВы положили: " + item);
            } else {
                System.out.println("\nНельзя положить - сначала вытащите предмет!");
            }
        } else {
            System.out.println("\nНельзя положить - сначала откройте коробку!");
        }
    }

    public void pullItem() {
        if (isOpen) {
            if (this.item != null) {
                this.item = null;
                System.out.println("\nКоробка была опустошена.");
            } else {
                System.out.println("\nНельзя вытащить - сначала положите предмет!");
            }
        } else {
            System.out.println("\nНельзя вытащить - Сначала откройте коробку!");
        }
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("\nКоробка была открыта.");
        } else {
            System.out.println("\nКоробка уже была открыта.");
        }
    }

    public void closed() {
        if (isOpen) {
            isOpen = false;
            System.out.println("\nКоробка была закрыта.");
        } else {
            System.out.println("\nКоробка уже была закрыта.");
        }
    }
}