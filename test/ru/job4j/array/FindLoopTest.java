package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void thenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data ,el);
        int expected = 0;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void thenArrayHasNot10ThenMinus1() {
        int[] data = {1, 5, 9, 11, -11};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}