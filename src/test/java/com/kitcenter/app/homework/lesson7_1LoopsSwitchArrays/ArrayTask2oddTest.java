package com.kitcenter.app.homework.lesson7_1LoopsSwitchArrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTask2oddTest {
    @Test // JUnit framework annotation
    public void arrayOddTest() {
        ArrayTask2odd arrayOdd = new ArrayTask2odd();
        String expRes = "[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]";
        Assert.assertEquals(expRes, arrayOdd.arrayTask2_odd(1, 99));
    }
}
