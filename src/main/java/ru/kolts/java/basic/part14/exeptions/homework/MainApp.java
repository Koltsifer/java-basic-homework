package ru.kolts.java.basic.part14.exeptions.homework;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"10", "2", "3", "5"},
                {"3", "4", "5", "5"},
                {"3", "2", "5", "5"},
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
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            System.out.println(sumArray4x4(arr2));
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            System.out.println(sumArray4x4(arr3));
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }

    public static int sumArray4x4(String[][] input) {
        if (!is4by4(input)) throw new AppArraySizeException("Размер массива может быть только 4 на 4");
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

    public static boolean is4by4(String[][] arr) {
        int max = 0;
        int min = arr[0].length;
        for (String[] strings : arr) {
            if (strings.length > max) {
                max = strings.length;
            }
            if (strings.length < min) {
                min = strings.length;
            }
        }
        return max == 4 && min == 4 & arr.length == 4;
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
