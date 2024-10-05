package ru.kolts.java.basic.homework14.lesson21;

/**
 * Реализация №1
 * <p>
 * Реализуйте метод, который создает double массив длиной 100_000_000 элементов
 * Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле:
 * array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
 * Засеките время выполнения цикла и выведите его в консоль.
 * <p>
 * Реализация №2:
 * <p>
 * Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока одновременно.
 * То есть первый поток заполняет первую четверть массива, второй - вторую и т.д. И посмотрите насколько
 * быстрее выполнится работа по сравнению с одним потоком.
 */

public class MainApp {
    private static final int ARRAY_SIZE = 100_000_000;
    private static final int THREAD_NUMBER = 4;

    public static void main(String[] args) {
        System.out.println("Реализация №1");
        double time = System.currentTimeMillis();
        monoThread();
        System.out.println("Секунд затрачено: " + ((System.currentTimeMillis() - time) / 1000)+ "\n");

        System.out.println("Реализация №2");
        time = System.currentTimeMillis();
        multiThreads();
        System.out.println("Секунд затрачено: " + ((System.currentTimeMillis() - time) / 1000) + "\n");
    }

    public static void monoThread() {
        double[] array = new double[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void multiThreads() {
        double[] array = new double[ARRAY_SIZE];
        Thread[] threads = new Thread[THREAD_NUMBER];

        for (int i = 0; i < THREAD_NUMBER; i++) {
            int min = (ARRAY_SIZE / THREAD_NUMBER) * i;
            int max = (ARRAY_SIZE / THREAD_NUMBER) * (i + 1);
            threads[i] = new Thread(() -> {
                for (int j = min; j < max; j++) {
                    array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
