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
        String fileName = "a.txt";
        printDir(path);
        File file = getFile(path, fileName);
        readFile(file);
        writeFile(file);
        readFile(file);
    }

    public static void printDir(String path){
        if (path == null){
            return;
        }
        File dir = new File(path);
        if (dir.isDirectory()){
            for (File f : Objects.requireNonNull(dir.listFiles())) {
                System.out.println(f.getName());
            }
            System.out.println();
        }
    }

    public static File getFile(String path, String fileName){
        if (path == null){
            return null;
        }
        File file = null;
            System.out.println("Укажите имя файла:");
            for (File f : Objects.requireNonNull(new File(path).listFiles())) {
                if (f.getName().equals(fileName)) {
                    file = f;
                }
            }
        return file;
    }

    public static void readFile(File file){
        if (file == null){
            return;
        }
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file){
        if (file == null){
            return;
        }
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true))) {
            System.out.println("Укажите данные для записи:");
            byte[] buffer = new Scanner(System.in).nextLine().getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}