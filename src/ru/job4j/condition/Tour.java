package ru.job4j.condition;

public class Tour {

    public static void offer(boolean passport) {
        System.out.println("A Client has foreign passport : " + passport);
        if (passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russian");
        }
    }

    public static void main(String[] args) {

        Tour.offer(true);
        Tour.offer(false);
    }
}
