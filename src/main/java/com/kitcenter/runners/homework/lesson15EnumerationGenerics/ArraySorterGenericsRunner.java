package com.kitcenter.runners.homework.lesson15EnumerationGenerics;

import com.kitcenter.app.homework.lesson15EnumerationGenerics.ArraySorterGenerics;

import java.util.Arrays;

public class ArraySorterGenericsRunner {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[7];
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = (int) (Math.random() * 999);
        }
        System.out.println(Arrays.toString(arr1));
        ArraySorterGenerics.arrayBubbleSortIncrease(arr1);
        ArraySorterGenerics<Integer> sort = new ArraySorterGenerics<>(arr1);
        sort.arrayBubbleSortIncrease();
        Double[] arr2 = new Double[7];
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = (Math.random());
        }
        System.out.println(Arrays.toString(arr2));
        ArraySorterGenerics.arrayBubbleSortIncrease(arr2);
        ArraySorterGenerics<Double> sort2 = new ArraySorterGenerics<>(arr2);
        sort2.arrayBubbleSortIncrease();
        Long[] arr3 = new Long[7];
        for (int i = 0; i <= arr3.length - 1; i++) {
            arr3[i] = (long) (Math.random() * 9999);
        }
        System.out.println(Arrays.toString(arr3));
        ArraySorterGenerics.arrayBubbleSortIncrease(arr3);
        ArraySorterGenerics<Long> sort3 = new ArraySorterGenerics<>(arr3);
        sort3.arrayBubbleSortIncrease();
        Float[] arr4 = new Float[7];
        for (int i = 0; i <= arr4.length - 1; i++) {
            arr4[i] = (float) (Math.random());
        }
        System.out.println(Arrays.toString(arr4));
        ArraySorterGenerics.arrayBubbleSortIncrease(arr4);
        ArraySorterGenerics<Float> sort4 = new ArraySorterGenerics<>(arr4);
        sort4.arrayBubbleSortIncrease();
        Short[] arr5 = new Short[7];
        for (int i = 0; i <= arr5.length - 1; i++) {
            arr5[i] = (short) (Math.random() * 99);
        }
        System.out.println(Arrays.toString(arr5));
        ArraySorterGenerics.arrayBubbleSortIncrease(arr5);
        ArraySorterGenerics<Short> sort5 = new ArraySorterGenerics<>(arr5);
        sort5.arrayBubbleSortIncrease();
        Byte[] arr6 = new Byte[7];
        for (int i = 0; i <= arr6.length - 1; i++) {
            arr6[i] = (byte) (Math.random() * 9);
        }
        System.out.println(Arrays.toString(arr6));
        ArraySorterGenerics.arrayBubbleSortIncrease(arr6);
        ArraySorterGenerics<Byte> sort6 = new ArraySorterGenerics<>(arr6);
        sort6.arrayBubbleSortIncrease();
    }
}
