package com.kitcenter.app.homework.Lesson9SwitchString;

public class PalindromeOrNot {
    public static void palindromeOrNot(String palindrome) {
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (Character.toLowerCase(palindrome.charAt(i)) == (Character.toLowerCase(palindrome.charAt
                            (palindrome.length() - i - 1))));
            System.out.println(i + ") isPalindrome = " + isPalindrome + " " + Character.toLowerCase(palindrome.charAt(i)) + " = " + Character.toLowerCase(palindrome.charAt
                    (palindrome.length() - i - 1)));
        }
        if (isPalindrome) {
            System.out.println("Palindrome: " + palindrome);
        } else {
            System.out.println("!Not a palindrome: " + palindrome);
        }
    }

    public static String palindromeOrNot2(String palindrome) {
        if (palindrome.equalsIgnoreCase(new StringBuilder(palindrome).reverse().toString())) {
            System.out.println("Palindrome: " + palindrome);
            return ("Palindrome: " + palindrome);
        } else {
            System.out.println("!Not a palindrome: " + palindrome);
            return ("!Not a palindrome: " + palindrome);
        }
    }

    public static void palindromeOrNot3(String palindrome) {
        char[] arr = palindrome.toCharArray();
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[(arr.length - 1) - i] = arr[i];
        }
        String palindrome2 = new String(arr2);
        System.out.println("Reversed string value: " + new String(arr2));
        if (palindrome.equalsIgnoreCase(palindrome2)) {
            System.out.println("Palindrome: " + palindrome);
        } else
            System.out.println("!Not a palindrome: " + palindrome);
    }
}


