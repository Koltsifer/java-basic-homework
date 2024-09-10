package ru.kolts.java.basic.homework12.lesson19.javaio;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

/**
 * Реализуйте приложение, позволяющее работать с текстовыми файлами
 * <p>
 * При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
 * <p>
 * Далее программа запрашивает имя файла, с которым хочет работать пользователь
 * <p>
 * Содержимое файла выводится в консоль
 * <p>
 * Затем любую введенную пользователем строку необходимо записывать в указанный файл
 */

public class MainApp {
    public static void main(String[] args) {
        String path = ".";
        printDir(path);
        File file = findFile(path);
        readFile(file);
        writeFile(file);
        readFile(file);
    }

    public static void printDir(String path) {
        if (path == null) {
            return;
        }
        File dir = new File(path);
        if (dir.isDirectory()) {
            for (File f : Objects.requireNonNull(dir.listFiles())) {
                System.out.println(f.getName());
            }
            System.out.println();
        }
    }

    public static File findFile(String path) {
        if (path == null) {
            return null;
        }
        System.out.println("Укажите имя файла:");
        String fileName = new Scanner(System.in).nextLine();
        for (File f : Objects.requireNonNull(new File(path).listFiles())) {
            if (f.getName().equals(fileName)) {
                return f;
            }
        }
        return null;
    }

    public static void readFile(File file) {
        if (file == null) {
            return;
        }
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            int n;
            while ((n = in.read()) != -1) {
                System.out.print((char) n);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file) {
        if (file == null) {
            return;
        }
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true))) {
            System.out.println("Укажите данные для записи:");
            out.write(new Scanner(System.in).nextLine().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}