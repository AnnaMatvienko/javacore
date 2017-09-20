package com.kitcenter.app.homework.utils.runners;

import com.kitcenter.app.homework.utils.converters.PrimitiveConvertor;

import java.util.Scanner;

public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConvertor pconvertor = new PrimitiveConvertor();
        Scanner scanner = new Scanner(System.in);
        pconvertor.floatToChar(scanner.nextFloat());
        pconvertor.intToChar(scanner.nextInt());
        pconvertor.charToInt();
    }
}
