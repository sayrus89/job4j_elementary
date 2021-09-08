package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenCheck() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void  whenNotCheck() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }

    @Test
    public void whenCheck1() {
        int[] left = {11, 22, 33};
        int[] right = {44, 55, 66};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}