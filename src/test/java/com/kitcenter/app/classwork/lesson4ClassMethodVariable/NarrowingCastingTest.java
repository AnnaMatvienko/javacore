package com.kitcenter.app.classwork.lesson4ClassMethodVariable;

import org.junit.Assert;
import org.junit.Test;

public class NarrowingCastingTest {
    @Test // JUnit framework annotation
    public void narrowingCastingTest() {
        double double1 = 3.14159236d;
        float expRes = 3.1415923f;
        Assert.assertEquals(0, Double.compare(expRes, NarrowingCasting.narrowing(double1)));
    }
}
