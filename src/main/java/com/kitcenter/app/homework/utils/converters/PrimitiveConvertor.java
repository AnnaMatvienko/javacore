package com.kitcenter.app.homework.utils.converters;


public class PrimitiveConvertor {
    public static void floatToChar(float convert) {
        float floatVar = convert;
        char charVar = (char) Math.abs(Math.round(floatVar));
        System.out.println("Input float value is: " + floatVar + ". " + "Output char value is: " + charVar);
    }

    public static void intToChar(int convert) {
        int intVar = convert;
        char charVar = (char) Math.abs(intVar);
        System.out.println("Input integer value is: " + intVar + ". " + "Output char value is: " + charVar);
    }

    public static void charToInt() {
        char charVar = '~';
        int intVar = (int) charVar;
        System.out.println("Input char value is: " + charVar + ". " + "Output int value is: " + intVar);
    }
}
