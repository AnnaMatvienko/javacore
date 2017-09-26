package com.kitcenter.app.homework.lesson7_1;

import java.util.Random;

public class ArrayTask4randomBig {
    public static void arrayTask4_randomBig(int size) {
        int min, max;
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            Random randomNum = new Random();
            arr[i] = randomNum.nextInt(1000);
            System.out.print("[" + arr[i] + "]" + " ");
        }
        min = arr[0];
        max = arr[0];
        for (int i = 0; i <= size - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("The array min element is " + min);
        System.out.println("The array max element is " + max);
    }
}
