package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return (ab + bc > ac) && (bc + ac > ab) && (ab + ac > bc);
    }

    public static void main(String[] args) {
        System.out.println(exist(1.0, 2.0, 5.0));
    }
}
