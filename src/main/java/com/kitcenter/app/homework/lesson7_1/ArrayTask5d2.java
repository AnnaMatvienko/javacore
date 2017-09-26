package com.kitcenter.app.homework.lesson7_1;

public class ArrayTask5d2 {
    public static void arrayTask5_2D(int n, int m, int from, int to) {
        int[][] arr = new int[n][m];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = (int) (Math.random() * (to-from) )+ from;
                System.out.print("[" + arr[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
    }
}
