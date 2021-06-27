package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP8K3Square3() {
        double expected = 3;
        double p = 8;
        double k = 3;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);
    }
    @Test
    public void whenP9K4Square324() {
        double expected = 3.24;
        double p = 9;
        double k = 4;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);

    }
    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}