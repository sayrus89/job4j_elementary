package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }

    @Test
    public void whenEndsWithPrefixThenTrue1() {
        char[] word = {'J', 'o', 'b'};
        char[] post = {'o', 'b'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndsWithPrefixThenTrue1() {
        char[] word = {'J', 'o', 'b'};
        char[] post = {'a', 'c'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}