package com.kitcenter.app.classwork.lesson7_1;

import java.util.Scanner;

public class Loop {
    public static void loop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 1st digit:");
        int a = scanner.nextInt();
        System.out.println("Please, enter 2nd digit:");
        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println("Nothing to be done: 1st digit is " + a + " and 2nd digit is " + b);
            System.exit(0);
        } else
            while (a > b) {
                a = a - 1;
                System.out.println("First entered digit should be decreased: now 1st digit is " + a + " and 2nd digit is " + b);
            }
    }
}
