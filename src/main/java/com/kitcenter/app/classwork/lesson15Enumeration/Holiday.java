package com.kitcenter.app.classwork.lesson15Enumeration;

public enum Holiday {
    NEW_YEAR(1, "January", "New Year"), CHRISTMAS(7, "January", "Christmas"), OLD_NEW_YEAR(14, "January", "Old New Year");

    private int date;
    private String month;
    private String holidayName;

    Holiday(int date, String month, String holidayName) {
        this.date = date;
        this.month = month;
        this.holidayName = holidayName;
    }

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public String getHolidayName() {
        return holidayName;
    }
}