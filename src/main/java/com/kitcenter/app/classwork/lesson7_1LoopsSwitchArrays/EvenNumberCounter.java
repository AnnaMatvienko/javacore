package com.kitcenter.app.classwork.lesson7_1LoopsSwitchArrays;

public class EvenNumberCounter {
    public static void evenNumberCounter() {
        int counter = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Counter: " + counter);
    }
}



