package com.kitcenter.runners.homework.lesson16Collections;

import java.util.ArrayList;

public class Category {
    private ArrayList<String> categoriesList =
            new ArrayList<String>();

    public void addCategory(String categoryName) {
        categoriesList.add(categoryName);
    }

    public void showAllCategories() {
        for (String el : categoriesList) {
            System.out.println("Category name: " + el);
        }
    }
}
