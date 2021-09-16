package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {4, 7, 9, 1, 3, 8, 5, 2, 6, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {11, 33, 77, 44, 99, 66, 22, 55, 88, 100};
        int[] result = SortSelected.sort(data);
        int[] expected = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        Assert.assertArrayEquals(expected, result);
    }
}