package com.kitcenter.runners.homework.lesson13OOPpolymorphismInheritanceComposition;

import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.Bouquet;
import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.Peony;
import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.Rose;
import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.Tulip;

import java.util.Scanner;

public class BouquetRunner {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        while (true) {
            System.out.println("Choose action that should be executed:");
            System.out.println("1 - Add a rose to the bouquet");
            System.out.println("2 - Add a tulip to the bouquet");
            System.out.println("3 - Add a peony to the bouquet");
            System.out.println("4 - Calculate bouquet price");
            System.out.println("5 - Exit");

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, enter menu number to run: ");
                int menuNumber = scanner.nextInt();
                switch (menuNumber) {
                    case 1: {
                        bouquet.addFlower(new Rose("White", 15, false));
                        break;
                    }

                    case 2: {
                        bouquet.addFlower(new Tulip("Coral", 7, true));
                        break;
                    }

                    case 3: {
                        bouquet.addFlower(new Peony("Pink", 11, true));
                        break;
                    }

                    case 4: {
                        System.out.println("Bouquet price is: " + bouquet.getPrice());
                        break;
                    }

                    case 5: {
                        System.out.println("You choose exiting the menu, goodbye!");
                        System.exit(0);
                        break;
                    }

                    default:
                        System.out.println("Invalid menu item. Make another choice(1-4).");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error!! Only menuNumber from the list should be entered!!");
            }
        }
    }
}
