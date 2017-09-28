package com.kitcenter.app.classwork.lesson7_1LoopsSwitchArrays;

import java.util.Arrays;

public class Array {
    public static String array() {
        int[] arr = new int[10];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        //Below is for each form for array
//        for (int arrEl : arr) {
//            System.out.println(arrEl + 100);
//        }
        return Arrays.toString(arr);
    }
}

