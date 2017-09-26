package com.kitcenter.app.homework.lesson7_1;

public class ArrayTask1even {
    public static void arrayTask1_even(int first, int last) {
        int size = ((last - first) / 2) + 1;
        int[] arr = new int[size];
        for (int value = first, i = 0; value <= last; value += 2) {
            arr[i] = value;
            System.out.print("[" + arr[i] + "]" + ""); //Print array elements in one row
            i++;
        }
        System.out.println(" ");
        for (int i = 0; i <= size - 1; i++) {
            System.out.println("[" + arr[i] + "]" + ""); //Print array elements in one column
        }
    }
}