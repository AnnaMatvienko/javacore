package com.kitcenter.runners.homework.lesson16Collections;

public class PhoneBookEntry {
    private String name;
    private int phoneNumber;
    private int categoryNumber;

    public PhoneBookEntry(String name, int phoneNumber, int categoryNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.categoryNumber = categoryNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public void showEntry() {
        System.out.println("Phone book entry data: ");
        System.out.println("Name: " + getName());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Category: " + getCategoryNumber());
    }
}
