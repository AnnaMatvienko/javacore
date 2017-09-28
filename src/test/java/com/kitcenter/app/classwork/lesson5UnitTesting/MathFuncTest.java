package com.kitcenter.app.classwork.lesson5UnitTesting;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {

    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
// The code below is an example how timeout in unit-tests can be set
    // JUnit framework annotation //interrupt after 1000ms
//    @Test(timeout = 1000)
//    public void infinityTest() {
//        while (true) ;
//    }
}