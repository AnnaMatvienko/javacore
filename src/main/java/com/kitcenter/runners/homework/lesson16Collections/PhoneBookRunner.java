package com.kitcenter.runners.homework.lesson16Collections;

import com.kitcenter.app.homework.lesson16Collections.PhoneBook;

import java.io.IOException;
import java.util.Scanner;

public class PhoneBookRunner {

    public static void categoryMembersActions(PhoneBook pb, String categoryName) {
        pb.checkWhetherCategoryExits(categoryName);

        try {
            while (true) {
                System.out.println("");
                System.out.println("This is phone book category MEMBER menu.");
                System.out.println("Choose category member NAME you want to work with.");
                System.out.println("If not-existing category member name is entered, a new category member item with this name will be created.");
                System.out.println("Find the list of available category members bellow (nothing is displayed if no category exists) and make you choice.");
                System.out.println("If you want to navigate to the previous menu (CATEGORY), write EXIT.");
                System.out.println("Available category members: ");
                pb.showAllCategoryMembers(categoryName);
                System.out.println("");
                System.out.println("Please, enter category member NAME to work with further: ");
                Scanner scanner = new Scanner(System.in);
                String categoryMember = scanner.next();
                System.out.println("");
                if (categoryMember.equalsIgnoreCase("Exit")) {
                    System.out.println("You choose navigating the previous menu!");
                    return;
                } else if ((pb.checkWhetherCategoryMemberExits(categoryName, categoryMember)) == false) {
                    System.out.println("Please, enter category member PHONE number to work with: ");
                    Integer memberPhone = scanner.nextInt();
                    pb.addCategoryMember(categoryName, categoryMember, memberPhone);
                    System.out.println("New category member added: " + categoryMember + ", " + memberPhone);
                } else {
                    System.out.println("Please, enter menu item to choose what to do with the current category member: ");
                    System.out.println("1: Edit category member NAME");
                    System.out.println("2: Edit category member PHONE number");
                    System.out.println("3: Nothing to do");
                    System.out.println("Please, enter menu number (1-3) to run: ");
                    int menuNumber = scanner.nextInt();
                    switch (menuNumber) {
                        case 1: {
                            System.out.println("");
                            System.out.println("Please, enter new NAME for the current category member: ");
                            String categoryMemberNewName = scanner.next();
                            pb.editCategoryMemberName(categoryName, categoryMemberNewName, categoryMember);
                            break;
                        }
                        case 2: {
                            System.out.println("");
                            System.out.println("Please, enter new PHONE number for the current category member: ");
                            int newMemberPhone = scanner.nextInt();
                            pb.editCategoryMemberPhone(categoryName, categoryMember, newMemberPhone);
                            System.out.println("New phone number is added: " + newMemberPhone);
                            break;
                        }
                        case 3: {
                            System.out.println("");
                            System.out.println("You choose nothing to do, so, you'll be redirected to category MEMBER menu.");
                            break;
                        }
                        default:
                            System.out.println("");
                            System.out.println("Invalid menu item. Make another choice (1-3).");
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error!! Only valid data should be entered!!");
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PhoneBook pb = new PhoneBook();
        pb.readFile();
        try {
            while (true) {
                System.out.println("");
                System.out.println("This is phone book CATEGORY menu.");
                System.out.println("User can perform search by name or phone number: just  enter Name or Number and you will be redirected to the search.");
                System.out.println("If not-existing category name is entered, a new category item with this name will be created.");
                System.out.println("Find the list of available categories bellow (nothing is displayed if no category exists) and make you choice. ");
                System.out.println("If you want to exit the program, write EXIT.");
                System.out.println("Available categories: ");
                pb.showAllCategories();
                Scanner scanner = new Scanner(System.in);
                System.out.println("");
                System.out.println("Please, enter CATEGORY name to work with further: ");
                String categoryName = scanner.next();
                if (categoryName.equalsIgnoreCase("Exit")) {
                    System.out.println("");
                    System.out.println("You choose exiting the menu, goodbye!");
                    pb.saveFile();
                    System.exit(0);
                } else if (categoryName.equalsIgnoreCase("Name")) {
                    System.out.println("");
                    System.out.println("You choose search by name, please, enter member name to complete search: ");
                    String name = scanner.next();
                    pb.searchCategoryMember(name);
                } else if (categoryName.equalsIgnoreCase("Number")) {
                    System.out.println("");
                    System.out.println("You choose search by phone, please, enter phone number to complete search: ");
                    Integer phone = scanner.nextInt();
                    pb.searchCategoryMemberPhone(phone);
                } else if ((pb.checkWhetherCategoryExits(categoryName)) == false) {
                    pb.addCategory(categoryName);
                    System.out.println("");
                    System.out.println("New category added: " + categoryName);
                } else {
                    System.out.println("");
                    System.out.println("The category already exists.");
                    categoryMembersActions(pb, categoryName);

                }
            }
        } catch (Exception e) {
            System.out.println("Error!! Only letters and digits should be entered!!");
        }
    }
}
