package com.kitcenter.runners.homework.lesson15EnumerationGenerics;

import com.kitcenter.app.homework.lesson15EnumerationGenerics.GuessingGame;

import java.util.Scanner;

public class GuessingGameRunner {
    public static void main(String[] args) {
        int previousIndex = -1;
        int counter = 0;
        while (true) {
            int index = (int) (Math.random() * 4);
            if (previousIndex != index) {
                previousIndex = index;
                Scanner scanner = new Scanner(System.in);
                System.out.println("How old is " + GuessingGame.values()[index].getPersonName() + "?");
                System.out.println("Please, enter the person age: ");
                int age = scanner.nextInt();
                System.out.println("Is " + GuessingGame.values()[index].getPersonName() + " still alive ?");
                System.out.println("Please, enter alive or dead: ");
                String status = scanner.next();
                if (age == GuessingGame.values()[index].getAge() && status.equalsIgnoreCase(GuessingGame.values()[index].getAliveStatus())) {
                    System.out.println("***You are right!!!***");
                    System.out.println("Right answers quantity: " + ++counter);
                } else {
                    counter = 0;
                    System.out.println("***You are wrong :( ***. Counter: " + counter);
                }
                if (counter == 3) {
                    System.out.println("You are the WINNER, goodbye!");
                    System.exit(0);
                }
            }
        }
    }
}
