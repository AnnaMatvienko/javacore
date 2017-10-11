package com.kitcenter.app.classwork.lesson9SwitchString;

public class Palindrome {
    public static void palindrome() {
        String palindrome = "moom";
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i) == palindrome.charAt
                            (palindrome.length() - i - 1));
        }
        if (isPalindrome) {
            System.out.println("Palindrome: " + palindrome);
        } else {
            System.out.println("Not a palindrome: " + palindrome);
        }
    }
}
