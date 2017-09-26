package com.kitcenter.app.homework.lesson7_1;

import java.util.Scanner;

public class Task7sumAccumulation {
    public static void sumAccumulation() {
        System.out.println("It is entered digits sum calculation program.");
        int sum = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a digit to calculate sum or enter Exit to exit the program: ");
                String inputValue = scanner.nextLine();
                if (inputValue.compareTo("Exit") == 0) {
                    System.out.println("You choose exiting the menu, goodbye! Current sum is: " + sum);
                    System.exit(0);
                } else {
                    int intValue = Integer.parseInt(inputValue);
                    sum += intValue;
                    System.out.println("Current sum is: " + sum);
                }
            } catch (Exception e) {
                System.out.println("Error!! Only digits should be entered!!");
            }
        }
    }
}