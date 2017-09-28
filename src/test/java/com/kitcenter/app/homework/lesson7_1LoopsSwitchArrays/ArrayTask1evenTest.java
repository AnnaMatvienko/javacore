package com.kitcenter.app.homework.lesson7_1LoopsSwitchArrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTask1evenTest {
    @Test // JUnit framework annotation
    public void arrayEvenTest() {
        ArrayTask1even arrayEven = new ArrayTask1even();
        String expRes = "[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]";
        Assert.assertEquals(expRes, arrayEven.arrayTask1even(2, 20));
    }
}