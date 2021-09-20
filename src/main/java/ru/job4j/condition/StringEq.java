package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = new String("one");
        String second = new String("one");
        if (first.equals(second)) {
            System.out.println("first equals second");
        } else {
            System.out.println("first does not equals second");
        }
    }
}
