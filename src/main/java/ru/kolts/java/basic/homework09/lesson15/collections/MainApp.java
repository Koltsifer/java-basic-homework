package ru.kolts.java.basic.homework09.lesson15.collections;

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
        System.out.println(list);

        System.out.println(sumList(list));
        fillList(5, list);
        System.out.println(list);

        increaseList(5, list);
        System.out.println(list);

        List<Employee> employeeList = new ArrayList<>();
        Collections.addAll(employeeList,
                new Employee("Дейв", 22),
                new Employee("Боб", 21),
                new Employee("Уилл", 25),
                new Employee("Рик", 29),
                new Employee("Джо", 35)
        );
        System.out.println(employeeList);

        List<Employee> trimedEmployeeList = listByAge(employeeList, 25);
        System.out.println(trimedEmployeeList);

        List<String> onlyNamesEmployeeList = listOfNames(employeeList);
        System.out.println(onlyNamesEmployeeList);

        System.out.println(isAgeAverage(employeeList, 30));
        System.out.println(isAgeAverage(employeeList, 20));

        Employee youngest = getYoungest(employeeList);
        System.out.println(youngest);
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

    //Employee methods
    public static List<String> listOfNames(List<Employee> list) {
        List<String> newList = new ArrayList<>();
        for (Employee employee : list) {
            newList.add(employee.getName());
        }
        return newList;
    }

    public static List<Employee> listByAge(List<Employee> list, int minAge) {
        List<Employee> newList = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= minAge) {
                newList.add(employee);
            }
        }
        return newList;
    }

    public static boolean isAgeAverage(List<Employee> list, int averageAge) {
        int average = 0;
        for (Employee employee : list) {
            average += employee.getAge();
        }
        return average / list.size() > averageAge;
    }

    public static Employee getYoungest(List<Employee> list) {
        Employee youngest = list.get(0);
        for (Employee employee : list) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }
}