package ru.kolts.java.basic.homewrok9.lesson15.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
 * последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
 * Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение
 * которых больше 5, и возвращающий сумму;
 * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать
 * каждую заполненную ячейку списка указанным числом;
 * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый
 * элемент списка на указанное число;
 * Создайте класс Сотрудник с полями: имя, возраст;
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий
 * список сотрудников, возраст которых больше либо равен указанному аргументу;
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
 * и проверяющий что средний возраст сотрудников превышает указанный аргумент;
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого
 * молодого сотрудника.
 */

public class MainApp {

    public static void main(String[] args) {
        List<Integer> list = createInRangeArray(2, 10);
        printList(list);
        System.out.println(sumList(list));
        fillList(5, list);
        printList(list);
        increaseList(5, list);
        printList(list);
    }

    public static void printList(List<Integer> list){
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> createInRangeArray(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        if (min <= max) {
            for (int i = min; i <= max; i++) {
                list.add(i);
            }
        } else {
            for (int i = min; i >= max; i--) {
                list.add(i);
            }
        }
        return list;
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            if (integer > 5) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void fillList(int in, List<Integer> list){
        for (Integer integer : list){
            list.set(list.indexOf(integer), in);
        }
    }

    public static void increaseList(int in, List<Integer> list){
        for (Integer integer : list){
            list.set(list.indexOf(integer), in + integer);
        }
    }
}