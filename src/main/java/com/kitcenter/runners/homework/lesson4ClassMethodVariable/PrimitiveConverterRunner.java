package com.kitcenter.runners.homework.lesson4ClassMethodVariable;

import com.kitcenter.app.homework.lesson4ClassMethodVariable.PrimitiveConverter;

import java.util.Scanner;

public class PrimitiveConverterRunner {
    public static void main(String[] args) {
        PrimitiveConverter pconverter = new PrimitiveConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the float variable value:");
        char char1 = pconverter.floatToChar(scanner.nextFloat());
        System.out.println("Please, enter the integer variable value:");
        char char2 = pconverter.intToChar(scanner.nextInt());
        int int1 = pconverter.charToInt('~');
    }
}
