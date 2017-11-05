package com.kitcenter.runners.homework.lesson10_11FileException;

import com.kitcenter.app.homework.lesson10_11FileException.AskText;

import java.util.Scanner;

public class AskTextRunner {
    public static void main(String[] args) {
        String filepath = "D:\\KIT\\javacore\\src\\main\\resources\\";
        System.out.println("Enter file name (filename.txt): ");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
        System.out.println(filename);
        System.out.println("Enter some text to be written down to the file: ");
        AskText text = new AskText(filepath + filename);
        text.askText();
    }
}