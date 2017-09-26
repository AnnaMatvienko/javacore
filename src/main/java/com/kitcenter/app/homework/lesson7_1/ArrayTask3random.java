package com.kitcenter.app.homework.lesson7_1;

import java.util.Random;

public class ArrayTask3random {
    public static void arrayTask3_random(int size) {
        int evenNQuantity = 0;
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            Random randomNum = new Random();
            arr[i] = randomNum.nextInt(10);
            System.out.print("[" + arr[i] + "]" + " ");
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                evenNQuantity++;
            }
        }
        System.out.println(" ");
        System.out.println("The array has " + evenNQuantity + " even numbers.");
    }
}
