package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
            System.out.println(numbers[index]);
        }
        System.out.println();
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
