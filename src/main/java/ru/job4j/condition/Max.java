package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rsl = Max.max(32, 23);
        System.out.println(rsl);
        rsl = Max.max(12, 21);
        System.out.println(rsl);
        rsl = Max.max(55, 55);
        System.out.println(rsl);
    }
}
