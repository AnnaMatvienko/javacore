package com.kitcenter.runners.homework.lesson7_1LoopsSwitchArrays;

import com.kitcenter.app.homework.lesson7_1LoopsSwitchArrays.Task7sumAccumulation;

import java.util.Scanner;

public class Task7sumAccumulationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It is entered digits sum calculation program.");
        int sum = 0;
        while (true) {
            try {
                System.out.println("Enter a digit to calculate sum or enter Exit to exit the program: ");
                sum = Task7sumAccumulation.sumAccumulation(scanner.nextLine(), sum);
            } catch (Exception e) {
                System.out.println("Error!! Only digits or Exit should be entered!!");
            }
        }
    }
}
