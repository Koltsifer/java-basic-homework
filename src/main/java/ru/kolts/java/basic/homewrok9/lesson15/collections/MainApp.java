package ru.kolts.java.basic.homewrok9.lesson15.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
 * последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);<p>
 * Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение
 * которых больше 5, и возвращающий сумму;<p>
 * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать
 * каждую заполненную ячейку списка указанным числом;<p>
 * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый
 * элемент списка на указанное число;<p>
 * Создайте класс Сотрудник с полями: имя, возраст;<p>
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;<p>
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий
 * список сотрудников, возраст которых больше либо равен указанному аргументу;<p>
 * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
 * и проверяющий что средний возраст сотрудников превышает указанный аргумент;<p>
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

        List<Employee> employeeList = new ArrayList<>();
        Collections.addAll(employeeList,
                new Employee("Дейв", 22),
                new Employee("Боб", 21),
                new Employee("Уилл", 25),
                new Employee("Рик", 29),
                new Employee("Джо", 35)
        );
        printList(employeeList);

        List<Employee> trimedEmployeeList = Employee.trimEmployeeListByAge(employeeList, 25);
        printList(trimedEmployeeList);

        List<String> onlyNamesEmployeeList = Employee.returnOnlyNamesList(employeeList);
        printList(onlyNamesEmployeeList);

        System.out.println(Employee.isAgeAverageInList(employeeList, 30));
        System.out.println(Employee.isAgeAverageInList(employeeList, 20));

        Employee youngest = Employee.returnYoungest(employeeList);
        System.out.println(youngest);
    }

    public static <T> void printList(List<T> list) {
        System.out.println("=====");
        for (T t : list) {
            System.out.println(t);
        }
        System.out.println("=====");
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

    public static void fillList(int in, List<Integer> list) {
        for (Integer integer : list) {
            list.set(list.indexOf(integer), in);
        }
    }

    public static void increaseList(int in, List<Integer> list) {
        for (Integer integer : list) {
            list.set(list.indexOf(integer), in + integer);
        }
    }
}