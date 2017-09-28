package com.kitcenter.app.classwork.lesson4ClassMethodVariable;

public class NarrowingCasting {

    public static float narrowing(double double1) {
        float float1 = (float) double1;
        System.out.println("NarrowingCasting::narrowing " + float1);
        return float1;
    }
}