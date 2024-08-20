package ru.kolts.java.basic.part8.exceptions.homework;
/**
 * Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4. Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
 * Метод должен обойти все элементы массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа), должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException и AppArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
 */
public class MainApp {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"10", "2", "3", "5"},
                {"3", "4", "5", "5"},
                {"3", "2", "5", "5"},
                {"10", "2", "3", "6"},
                {"10", "2", "3", "6"}
        };
        String[][] arr2 = {
                {"10", "2", "3", "5"},
                {"sadas", "4", "5", "1"},
                {"3", "2", "5", "5"},
                {"10", "2", "3", "asd"}
        };
        String[][] arr3 = new String[3][5];

        try {
            System.out.println(sumArray4x4(arr1));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        try {
            System.out.println(sumArray4x4(arr2));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        try {
            System.out.println(sumArray4x4(arr3));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static int sumArray4x4(String[][] input) {
        checkIs4by4(input);
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (!isNumber(input[i][j])) throw new AppArrayDataException("В мессиве лежит не числовое знаение. " +
                        "Ячейка: [" + i + "][" + j + "]");
                sum += Integer.parseInt(input[i][j]);
            }
        }
        return sum;
    }

    public static void checkIs4by4(String[][] arr) {
        if (arr.length != 4) throw new AppArraySizeException("Размер массива может быть только 4 на 4");
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new AppArraySizeException("Размер массива может быть только 4 на 4");
            }
        }
    }

    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
