package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void whenRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, 4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 4},
                {1, 2, 0, 0, 5}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenRow3AndColumn3() {
        int[][] array = {
                {-1, 2, -3},
                {4, -5, 6},
                {-7, 8, -9}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {0, 2, 0},
                {4, 0, 6},
                {0, 8, 0}
        };
        Assert.assertArrayEquals(expected, result);
    }
}