package com.kitcenter.app.classwork.lesson4;

public class NarrowingCasting {

//    int int1 = 0;
//    float float1 = 3.14159f;
    double double1 = 3.14159236d;
    float float1 = 0.0f;

    public void narrowing() {
//        int1 = (int) float1;
//        System.out.println(int1);
//    }


        float1 = (float) double1;
        System.out.println(float1);
    }
}