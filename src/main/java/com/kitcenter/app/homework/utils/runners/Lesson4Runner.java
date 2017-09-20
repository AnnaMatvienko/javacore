package com.kitcenter.app.homework.utils.runners;

import com.kitcenter.app.homework.utils.converters.PrimitiveConvertor;

import java.util.Scanner;

public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConvertor pconvertor = new PrimitiveConvertor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the float variable value:");
        pconvertor.floatToChar(scanner.nextFloat());
        System.out.println("Please, enter the integer variable value:");
        pconvertor.intToChar(scanner.nextInt());
        pconvertor.charToInt();
    }
}
