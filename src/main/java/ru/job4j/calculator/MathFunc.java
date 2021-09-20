package ru.job4j.calculator;

public class MathFunc {
    public static int function1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int function2(int x) {
        int y = x * 10;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.function1(3);
        int result2 = MathFunc.function2(5);
        int result3 = MathFunc.function1(100);
        int total = result1 + result2;
        System.out.println(total);
        System.out.println(result3);

    }
}
