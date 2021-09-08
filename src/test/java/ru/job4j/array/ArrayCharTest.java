package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }

    @Test
    public void whenStartWithPrefixThenTrue1() {
        char[] word = new char[] {'J', 'o', 'b'};
        char[] pref = new char[] {'J', 'o'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }
}