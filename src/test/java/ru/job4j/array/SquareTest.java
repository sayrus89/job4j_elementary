package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound8then01491625364964() {
        int bound = 9;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16, 25, 36, 49, 64};
        Assert.assertArrayEquals(expected, result);

    }
}