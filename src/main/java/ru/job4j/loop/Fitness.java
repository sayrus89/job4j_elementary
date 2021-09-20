package ru.job4j.loop;

public class Fitness {
    public static int calculate(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(Fitness.calculate(95, 90));
        System.out.println(Fitness.calculate(90, 95));
        System.out.println(Fitness.calculate(50, 90));
        System.out.println(Fitness.calculate(90, 90));
    }
}
