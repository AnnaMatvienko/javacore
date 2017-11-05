package com.kitcenter.runners.homework.lesson16Collections;

import com.kitcenter.app.homework.lesson16Collections.PhoneBookEntry;
import com.kitcenter.app.homework.lesson16Collections.phoneBook;

import java.util.Scanner;

public class PhoneBookRunner {
    public static void main(String[] args) {
        phoneBook pb = new phoneBook();
//        pb.getCategory().addCategory("family");
//        pb.getCategory().addCategory("friends");
//        pb.getCategory().addCategory("work");
//        pb.getCategory().addCategory("health");
//        pb.getCategory().addCategory("entertainment");
//        pb.getCategory().addCategory("other");
//        pb.getCategory().showAllCategories();

        while (true) {
            System.out.println("Choose category name you want to work with.");
            System.out.println("If not-existing category name is entered, a new category item with this name will be created.");
            System.out.println("If you want to exit the program, write EXIT.");
            System.out.println("Find the list of available categories and make you choice: ");
            pb.getCategory().showAllCategories();

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, enter menu item to run: ");
                String item = scanner.next();
                if (item.equalsIgnoreCase("Exit")) {
                    System.out.println("You choose exiting the menu, goodbye!");
                    System.exit(0);
                } else if ((pb.getCategory().checkWhetherCategoryExits(item)) == -1) {
                    pb.getCategory().addCategory(item);
                    System.out.println("New category added: " + item);
                } else {
                    System.out.println("The category already exists.");
                    int index = pb.getCategory().checkWhetherCategoryExits(item);
                    while (true) {
                        System.out.println("Please, enter menu item to choose what to do with the current category: ");
                        System.out.println("1: Change current record name");
                        System.out.println("2: Change current record number");
                        System.out.println("3: Add new record");
                        System.out.println("4: Exit the menu");
                        try {
                            System.out.println("Please, enter menu number to run: ");
                            int menuNumber = scanner.nextInt();
                            switch (menuNumber) {
                                case 1: {

                                    break;
                                }
                                case 2: {

                                    break;
                                }
                                case 3: {
       //                                     pb.addPhoneBookEntry();
                                    break;
                                }
                                case 4: {
                                    System.out.println("You choose exiting the menu, goodbye!");
                                    System.exit(0);
                                }
                                default:
                                    System.out.println("Invalid menu item. Make another choice (1-4).");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Error!! Only digits should be entered!!");
                        }

                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error!! Only items from the list should be entered!!");
            }
        }

    }
}
