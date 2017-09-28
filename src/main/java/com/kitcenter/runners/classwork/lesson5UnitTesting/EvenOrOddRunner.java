package com.kitcenter.runners.classwork.lesson5UnitTesting;

import com.kitcenter.app.classwork.lesson5UnitTesting.EvenOrOdd;

import java.util.Scanner;

public class EvenOrOddRunner {

    public static void main(String[] args) {
        EvenOrOdd define = new EvenOrOdd();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a digit: ");
        int result = define.evenOrOdd(scanner.nextInt());
        switch (result) {
            case 0: {
                System.out.println("The digit is even.");
                break;
            }
            case 1: {
                System.out.println("The digit is odd.");
                break;
            }
        }
    }
}
