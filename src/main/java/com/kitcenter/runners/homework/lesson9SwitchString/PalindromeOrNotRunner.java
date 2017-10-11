package com.kitcenter.runners.homework.lesson9SwitchString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.kitcenter.app.homework.Lesson9SwitchString.PalindromeOrNot.*;

public class PalindromeOrNotRunner {
    public static void main(String[] args) {
        System.out.println("Method1. Enter a word (or a phrase, but without spaces) to define whether it is a palindrome or not: ");
        BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
        String palindrome = null;
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeOrNot(palindrome);
        System.out.println("Method2. Enter a word (or a phrase, but without spaces) to define whether it is a palindrome or not: ");
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeOrNot2(palindrome);
        System.out.println("Method3. Enter a word (or a phrase, but without spaces) to define whether it is a palindrome or not: ");
        try {
            palindrome = bfreader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(palindrome);
        palindromeOrNot3(palindrome);
    }
}
