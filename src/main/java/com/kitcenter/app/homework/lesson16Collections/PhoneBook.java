package com.kitcenter.app.homework.lesson16Collections;

import java.io.*;
import java.util.HashMap;

public class PhoneBook implements Serializable {
    private static final String PATH = "D:\\KIT\\javacore\\src\\main\\resources\\phonebook.txt";
    private HashMap<String, HashMap<String, Integer>> hmBook = new HashMap();

    public void saveFile()
            throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(PATH))) {
            os.writeObject(hmBook);
        }
    }

    public void readFile()
            throws ClassNotFoundException, IOException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(PATH))) {
            hmBook = (HashMap<String, HashMap<String, Integer>>) is.readObject();
            System.out.println(hmBook);
        } catch (Exception e) {
            System.out.println("Attention!! Phone Book file is empty so far.");
        }
    }

    public void showAllCategories() {
        for (String el : hmBook.keySet()) {
            System.out.println(el.hashCode() + ") Category name: " + el);
        }
    }

    public boolean checkWhetherCategoryExits(String item) {
        return hmBook.containsKey(item);
    }

    public void addCategory(String categoryName) {
        hmBook.put(categoryName, new HashMap<>());
    }

    public void showAllCategoryMembers(String categoryName) {
        for (String el : hmBook.get(categoryName).keySet()) {
            System.out.println(el.hashCode() + ") Category member: " + el + ", phone number: " + hmBook.get(categoryName).get(el));
        }
    }

    public boolean checkWhetherCategoryMemberExits(String categoryName, String categoryMember) {
        return hmBook.get(categoryName).containsKey(categoryMember);
    }

    public void addCategoryMember(String categoryName, String categoryMember, Integer memberPhone) {
        hmBook.get(categoryName).put(categoryMember, memberPhone);
    }

    public void editCategoryMemberPhone(String categoryName, String categoryMember, Integer newMemberPhone) {
        hmBook.get(categoryName).replace(categoryMember, newMemberPhone);
    }

    public void editCategoryMemberName(String categoryName, String categoryMemberNewName, String categoryMember) {
        hmBook.get(categoryName).put(categoryMemberNewName, hmBook.get(categoryName).remove(categoryMember));
    }

    public void searchCategoryMemberPhone(Integer phone) {
        boolean found = false;
        for (String categoryName : hmBook.keySet()) {
            for (String name : hmBook.get(categoryName).keySet()) {
                if (phone.equals(hmBook.get(categoryName).get(name))) {
                    System.out.println("Category name: " + categoryName + ", Category member: " + name + ", phone number: " + hmBook.get(categoryName).get(name));
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("");
            System.out.println("No such phone exists in the phone book, please enter another phone number!");
        }
    }

    public void searchCategoryMember(String memberName) {
        boolean found = false;
        for (String categoryName : hmBook.keySet()) {
            for (String name : hmBook.get(categoryName).keySet()) {
                if (name.regionMatches(true, 0, memberName, 0, memberName.length())) {
                    System.out.println("Category name: " + categoryName + ", Category member: " + name + ", phone number: " + hmBook.get(categoryName).get(name));
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("");
            System.out.println("No such member exists in the phone book, please enter another name!");
        }
    }
}