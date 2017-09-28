package com.kitcenter.app.classwork.lesson7_1LoopsSwitchArrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test // JUnit framework annotation
    public void arrayTest() {
        Array testarr = new Array();
        int size = 10;
        String expRes = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";
        Assert.assertEquals(expRes, testarr.array());
    }
}