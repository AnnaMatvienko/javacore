package com.kitcenter.app.homework.lesson4ClassMethodVariable;

public class PrimitiveConverter {
    public static char floatToChar(float convert) {
        float floatVar = convert;
        char charVar = (char) Math.abs(Math.round(floatVar));
        System.out.println("Input float value is: " + floatVar + ". " + "Output char value is: " + charVar);
        return charVar;
    }

    public static char intToChar(int convert) {
        int intVar = convert;
        char charVar = (char) Math.abs(intVar);
        System.out.println("Input integer value is: " + intVar + ". " + "Output char value is: " + charVar);
        return charVar;
    }

    public static int charToInt(char convert) {
        char charVar = convert;
        int intVar = (int) charVar;
        System.out.println("Input char value is: " + charVar + ". " + "Output int value is: " + intVar);
        return intVar;
    }
}
