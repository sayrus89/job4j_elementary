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
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 2, 3, 4, 5, 6, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to5() {
        int[] input = new int[] {11, 22, 33, 44, 55, 66};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {66, 22, 33, 44, 55, 11};
    }
}