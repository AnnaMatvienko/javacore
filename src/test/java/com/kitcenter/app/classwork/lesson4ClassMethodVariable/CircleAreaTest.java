package com.kitcenter.app.classwork.lesson4ClassMethodVariable;

import org.junit.Assert;
import org.junit.Test;

public class CircleAreaTest {
    @Test // JUnit framework annotation
    public void CircleAreaTest() {
        CircleArea circleArea = new CircleArea();
        double r1 = 7.8, r2 = 7.99, expRes = 200.55958916445098;
        Assert.assertEquals(0, Double.compare(expRes, circleArea.calculateMaxArea(r1, r2)));
        double r3 = 17.99, r4 = 7.8, expRes2 = 1016.7453605671328;
        Assert.assertEquals(0, Double.compare(expRes2, circleArea.calculateMaxArea(r3, r4)));
        double r5 = 7.97, r6 = 7.97, expRes3 = 199.55679278942503;
        Assert.assertEquals(0, Double.compare(expRes3, circleArea.calculateMaxArea(r5, r6)));
    }
}

