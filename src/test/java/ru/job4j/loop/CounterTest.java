package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom3to25Then() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenSumEvenNumbersFrom1to10Then30() {
        int start = 7;
        int finish = 33;
        int result = Counter.sumByEven(start, finish);
        int expected = 260;
        Assert.assertEquals(expected, result);
    }
}