package com.kitcenter.app.classwork.lesson9SwitchString;

public class CharToStringArray {
    public static void charToStringArray() {
        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};
        for (int i = 0; i <= charArrayToString.length - 1; i++) {
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }
}