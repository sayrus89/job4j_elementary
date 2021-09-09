package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to6() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 2, 3, 4, 5, 6, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to5() {
        int[] input = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int source = 4;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 20, 30, 40, 60, 50, 70, 80, 90, 100};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = new int[]{11, 22, 33, 44, 55, 66};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 22, 44, 33, 55, 66};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = SwitchArray.swap(input, 3, 4);
        int[] expected = {1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to6() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = SwitchArray.swap(input, 5, 6);
        int[] expected = {1, 2, 3, 4, 5, 7, 6, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}