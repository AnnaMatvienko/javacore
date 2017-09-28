package com.kitcenter.app.classwork.lesson5UnitTesting;

import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {

    @Test // JUnit framework annotation
    public void evenOrOdd() {
        int digit = 7, expRes = 1;
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        Assert.assertEquals(expRes, evenOrOdd.evenOrOdd(digit));
        int digit2 = 8, expRes2 = 0;
        Assert.assertEquals(expRes2, evenOrOdd.evenOrOdd(digit2));
    }
}
