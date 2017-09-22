package com.kitcenter.app.classwork.lesson7_1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

public class Array {
    public static void array() {
        int[] arr = new int[10];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        for (int arrEl : arr) {
            System.out.println(arrEl + 100);
        }
        System.out.println(Arrays.toString(arr));
    }
}
