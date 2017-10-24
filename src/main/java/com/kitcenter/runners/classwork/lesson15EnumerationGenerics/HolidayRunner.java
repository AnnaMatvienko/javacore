package com.kitcenter.runners.classwork.lesson15Enumeration;

import com.kitcenter.app.classwork.lesson15EnumerationGenerics.Holiday;

public class HolidayRunner {
    public static void main(String[] args) {

        for (Holiday hd : Holiday.values()) {
            System.out.println(hd.getHolidayName() + " " + "holiday is on " + hd.getMonth() + "," + " " + hd.getDate());
        }
    }
}


