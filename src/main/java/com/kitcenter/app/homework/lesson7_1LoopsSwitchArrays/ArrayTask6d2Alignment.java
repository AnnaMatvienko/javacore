package com.kitcenter.app.homework.lesson7_1LoopsSwitchArrays;

public class ArrayTask6d2Alignment {
    public static void arrayTask6_2dAlignment(int n, int m, int from, int to) {
        int[][] arr = new int[n][m];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = (int) (Math.random() * (to - from)) + from;
                System.out.printf("[%3d] ", arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
