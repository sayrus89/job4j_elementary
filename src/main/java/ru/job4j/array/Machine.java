package ru.job4j.array;


import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        // Найти размер сдачи.
        int change = money - price;
        // Пройти по массиву монет.
        for (int i = 0; i < coins.length; i++) {
            // В цикле while проверить условия отбора монет автоматом (начиная с самой крупной).
            while (change - coins[i] >= 0) {
                // отнимаем от сдачи номинал очередной монеты.
                change = change - coins[i];
                // кладём монету в массив.
                rsl[size] = coins[i];
                // увеличиваем размер массива.
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
