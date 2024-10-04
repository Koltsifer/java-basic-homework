package ru.kolts.java.basic.homework13.lesson20;

public class Utils {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isOperation(String strNum) {
        if (strNum == null) {
            return false;
        }
        return strNum.contains("/") || strNum.contains("-") || strNum.contains("*") || strNum.contains("+");
    }
}