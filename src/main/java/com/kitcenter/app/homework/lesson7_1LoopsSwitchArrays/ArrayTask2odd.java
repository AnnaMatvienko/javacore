package com.kitcenter.app.homework.lesson7_1LoopsSwitchArrays;

import java.util.Arrays;

public class ArrayTask2odd {
    public static String arrayTask2_odd(int first, int last) {
        int size = ((last - first) / 2) + 1;
        int[] arr = new int[size];
        for (int value = first, i = 0; value <= last; value += 2) {
            arr[i] = value;
            System.out.println("[" + arr[i] + "]");
            i++;
        }
        System.out.println(" ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print("[" + arr[i] + "]");
        }
        return Arrays.toString(arr);
    }
}