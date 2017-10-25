package com.kitcenter.app.homework.lesson15EnumerationGenerics;

import java.util.Arrays;

public class ArraySorterGenerics<T extends Number> {
    private T[] arr;

    public ArraySorterGenerics(T[] arr) {
        this.arr = arr;
    }

    public static <T extends Number> T[] arrayBubbleSortIncrease(T[] arr) {
        T temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("i: " + i + " Array: " + Arrays.toString(arr));
        }
        return arr;
    }

    public void arrayBubbleSortIncrease() {
        T temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("i: " + i + " Array: " + Arrays.toString(arr));
        }
    }
}