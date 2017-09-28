package com.kitcenter.app.classwork.lesson4ClassMethodVariable;

public class WideningCasting {
    //correct conversion 64f<=32f<=64<=32<=16<=8
    public static double widening(byte byte1) {
        short short1 = 0;
        int int1 = 0;
        long long1 = 0L;
        float float1 = 0.0f;
        double double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println("WideningCasting::widening " + double1);
        return double1;
    }
}
