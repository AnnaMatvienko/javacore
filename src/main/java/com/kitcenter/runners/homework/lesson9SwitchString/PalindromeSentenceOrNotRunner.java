package com.kitcenter.runners.homework.lesson9SwitchString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.kitcenter.app.homework.Lesson9SwitchString.PalindromeSentenceOrNot.*;

public class PalindromeSentenceOrNotRunner {
    public static void main(String[] args) {
        System.out.println("Method1. Enter a word (or a phrase, spaces/commas are allowed) to define whether it is a palindrome or not: ");
        BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
        String palindrome = null;
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeSentenceOrNot(palindrome);
        System.out.println("");

        System.out.println("Method2. Enter a word (or a phrase, spaces/commas are allowed) to define whether it is a palindrome or not: ");
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeSentenceOrNot2(palindrome);
        System.out.println("");

        System.out.println("Method3. Enter a word (or a phrase, spaces/commas are allowed) to define whether it is a palindrome or not: ");
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeSentenceOrNot3(palindrome);
        System.out.println("");

        System.out.println("Method4. Enter a word (or a phrase, spaces/commas are allowed) to define whether it is a palindrome or not: ");
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeSentenceOrNot4(palindrome);
        System.out.println("");

        System.out.println("Method5. Enter a word (or a phrase, spaces/commas are allowed) to define whether it is a palindrome or not: ");
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeSentenceOrNot5(palindrome);
        System.out.println("");
    }
}
