package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    public String surname;
    public static final String NEWVALUE = "";

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method1(int a, int b, int c, int d) {

    }

    void method2(int e, int f, int g, int h) {

    }

    String name;

    Broken() {
    }
}