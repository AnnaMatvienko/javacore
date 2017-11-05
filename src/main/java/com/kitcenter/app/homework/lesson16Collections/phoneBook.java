package com.kitcenter.app.homework.lesson16Collections;

import java.util.ArrayList;

public class phoneBook {
    private Category category = new Category();

    private ArrayList<PhoneBookEntry> phoneBookEntryList =
            new ArrayList<PhoneBookEntry>();

    public void addPhoneBookEntry(PhoneBookEntry entry) {
        phoneBookEntryList.add(entry);
    }

    public Category getCategory() {
        return category;
    }

    public void showAllPhoneBookEntries() {
        for (PhoneBookEntry el : phoneBookEntryList) {
            el.showEntry();
        }}

    public void showPhoneBookEntriesForCategory(int categoryIndex) {
        for (PhoneBookEntry el : phoneBookEntryList) {
            if (el.getCategoryNumber()==categoryIndex){
            el.showEntry();
        }}

}}
