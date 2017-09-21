package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a digit: ");
        int digit = scanner.nextInt();
        if ((digit % 2) == 1){
            System.out.print("The digit is odd");
        }
        else {
            System.out.print("The digit is even");
        }
    }
}