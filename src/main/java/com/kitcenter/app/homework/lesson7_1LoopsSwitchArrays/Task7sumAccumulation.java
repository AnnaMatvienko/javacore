package com.kitcenter.app.homework.lesson7_1LoopsSwitchArrays;

public class Task7sumAccumulation {

    public static int sumAccumulation(String inputValue, int sum) {
        System.out.println("Task7sumAccumulation::sumAccumulation");
        if (inputValue.compareTo("Exit") == 0) {
            System.out.println("You choose exiting the menu, goodbye! Current sum is: " + sum);
            System.exit(0);
        } else {
            int intValue = Integer.parseInt(inputValue);
            sum += intValue;
            System.out.println("Current sum is: " + sum);
        }
        return sum;
    }
}


