package com.kitcenter.app.classwork.lesson4ClassMethodVariable;

import org.junit.Assert;
import org.junit.Test;

public class WideningCastingTest {
    @Test // JUnit framework annotation
    public void narrowingCastingTest() {
        byte byte1 = 127;
        double expRes = 127.0;
        Assert.assertEquals(0, Double.compare(expRes, WideningCasting.widening(byte1)));
    }
}
