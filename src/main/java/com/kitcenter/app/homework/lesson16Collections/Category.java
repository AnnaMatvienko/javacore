package com.kitcenter.app.homework.lesson16Collections;

import java.util.ArrayList;

public class Category {
    private ArrayList<String> categoriesList =
            new ArrayList<String>();

    public void addCategory(String categoryName) {
        categoriesList.add(categoryName);
    }

    public void showAllCategories() {
        for (String el : categoriesList) {
            System.out.println(categoriesList.indexOf(el) + ") Category name: " + el);
        }
    }

    public int checkWhetherCategoryExits(String item) {
        int result = -1;
        for (String el : categoriesList) {
            if (item.equalsIgnoreCase(el)) {
                result = categoriesList.indexOf(el);
                System.out.println("The category you entered already exists. You will be proceed to work with this category #" + result);
                return result;
            }
        }
        return result;
    }
}
