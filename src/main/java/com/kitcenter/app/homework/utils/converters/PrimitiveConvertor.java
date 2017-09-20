package com.kitcenter.app.homework.utils.converters;


public class PrimitiveConvertor {
    public static void floatToChar(float convert) {

        System.out.println("Please, enter the float variable value:");
        float floatVar = convert;
        char charVar = (char) Math.abs(Math.round(floatVar));
        System.out.println("Input float value is: " + floatVar + ". " + "Output char value is: " + charVar);
    }

    public static void intToChar(int convert) {

        System.out.println("Please, enter the integer variable value:");
        int intVar = convert;
        char charVar = (char) Math.abs(intVar);
        System.out.println("Input integer value is: " + intVar + ". " + "Output char value is: " + charVar);
    }

    public static void charToInt() {
        System.out.println("Please, enter the char variable value:");
        char charVar = '~';
        int intVar = (int) charVar;
        System.out.println("Input char value is: " + charVar + ". " + "Output int value is: " + intVar);
    }
}
