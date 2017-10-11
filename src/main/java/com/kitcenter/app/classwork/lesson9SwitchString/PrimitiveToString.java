package com.kitcenter.app.classwork.lesson9SwitchString;

public class PrimitiveToString {
    public static void primitiveToString() {
        double doubleVar = 1000.8902;
        String doubleToString = String.valueOf(doubleVar);
        System.out.println("Double variable is now String: " + doubleToString);
        System.out.println("String variable is back to double: " + (Double.valueOf(doubleToString) + 0.111) + 'z');
        int intVar = 666;
        String intToString = String.valueOf(intVar);
        System.out.println("Int variable is now String: " + intToString);
        System.out.println("String variable is back to int: " + (Integer.valueOf(intToString) + 5) + 'k');
    }
}
