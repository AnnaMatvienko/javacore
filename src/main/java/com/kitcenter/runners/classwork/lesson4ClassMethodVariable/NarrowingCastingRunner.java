package com.kitcenter.runners.classwork.lesson4ClassMethodVariable;

import com.kitcenter.app.classwork.lesson4ClassMethodVariable.NarrowingCasting;

public class NarrowingCastingRunner {
    public static void main(String[] args) {
        NarrowingCasting casting = new NarrowingCasting();
        double double1 = 3.14159236d;
        float float1 = 0.0f;
        float float2 = casting.narrowing(double1);
    }
}
