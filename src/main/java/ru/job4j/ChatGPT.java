package ru.job4j;

public class ChatGPT {

    /**
     *  найди ошибку в коде package ru.job4j.array;
     * public class SortSelected {
     *     public static int[] sort(int[] data) {
     *         for (int i = 0; i < data.length; i++) {
     *             int min = MinDiapason.findMin(data, i, data.length - 1);
     *             int index = FindLoop.indexInRange(data, min, i,  data.length - 1);
     *             int[] sorted = SwitchArray.swap(data, data[index], data[i]);
     *         }
     *         return data;
     *     }
     * }
     *
     *    Исправленный код:
     * package ru.job4j.array;
     *
     * public class SortSelected {
     *     public static int[] sort(int[] data) {
     *         for (int i = 0; i < data.length; i++) {
     *             int min = MinDiapason.findMin(data, i, data.length - 1);
     *             int index = FindLoop.indexInRange(data, min, i, data.length - 1);
     *             // Передаем индексы элементов, которые нужно поменять местами
     *             SwitchArray.swap(data, i, index);
     *         }
     *         return data;
     *     }
     * }
     */
}