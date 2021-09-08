package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != result) {
                return false;
            }
        }
        return true;
    }
}
