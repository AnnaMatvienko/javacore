package com.kitcenter.runners.classwork.lesson16Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> myList =
                new ArrayList<String>();
        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        String string3 = "adc";
        myList.add(string3);
        int theSize = myList.size();
        System.out.println("1: " + theSize);
        System.out.println("2: " + myList.toString());
        System.out.println("3: " + myList.contains("abc"));
        System.out.println("4: " + myList.isEmpty());
        System.out.println("5: " + myList.indexOf("bcd"));
        System.out.println("6: " + myList.get(2));
        System.out.println("7: " + myList.remove(0));
        System.out.println("8: " + myList.remove("bbb"));
        System.out.println("9: " + myList.remove("bcd"));
        System.out.println("Enter 10 words from keyboard to be added to the array list: ");
        for (int i = 0; i <= 10; i++) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            myList.add(str);
        }
        System.out.println("10: " + myList.toString());
    }
}
