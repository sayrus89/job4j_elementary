package ru.job4j.checkstyle;

public class Broken {
    private String name;
    private int sizeOfEmpty = 10;
    private String surname;
    public static final String NEWVALUE = "";

    public Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method1(int a, int b, int c, int d) {

    }

    public void method2(int e, int f, int g, int h) {

    }
}