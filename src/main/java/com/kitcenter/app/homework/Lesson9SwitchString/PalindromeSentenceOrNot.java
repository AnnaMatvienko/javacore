package com.kitcenter.app.homework.Lesson9SwitchString;

public class PalindromeSentenceOrNot {
    public static void palindromeSentenceOrNot(String palindrome) {
        boolean isPalindrome = true;
        palindrome = palindrome.trim().replaceAll(",", "").replaceAll(" ", "");
        System.out.println(palindrome);
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (Character.toLowerCase(palindrome.charAt(i)) == (Character.toLowerCase(palindrome.charAt
                            (palindrome.length() - i - 1))));
        }
        if (isPalindrome) {
            System.out.println("Palindrome: " + palindrome);
        } else {
            System.out.println("!Not a palindrome: " + palindrome);
        }
    }

    public static void palindromeSentenceOrNot2(String palindrome) {
        if (palindrome.trim().replaceAll(",", "").replaceAll(" ", "").equalsIgnoreCase(new StringBuilder(palindrome.trim().replaceAll(",", "").replaceAll(" ", "")).reverse().toString())) {
            System.out.println("Palindrome: " + palindrome);
        } else {
            System.out.println("!Not a palindrome: " + palindrome);
        }
    }

    public static void palindromeSentenceOrNot3(String palindrome) {
        palindrome = palindrome.trim().replaceAll(",", "").replaceAll(" ", "");
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

    public static void palindromeSentenceOrNot4(String palindrome) {
        palindrome = palindrome.trim().replaceAll(",", "").replaceAll(" ", "");
        System.out.println(palindrome);
        String palindrome1;
        String palindrome2;
        if (palindrome.length() % 2 == 0) {
            palindrome1 = palindrome.substring(0, (palindrome.length() / 2));
            System.out.println("palindrome1: " + palindrome1);
            palindrome2 = palindrome.substring((palindrome.length() / 2), palindrome.length());
            System.out.println("palindrome2: " + palindrome2);
        } else {
            palindrome1 = palindrome.substring(0, (palindrome.length() / 2) + 1);
            System.out.println("palindrome1: " + palindrome1);
            palindrome2 = palindrome.substring(((palindrome.length() / 2)), palindrome.length());
            System.out.println("palindrome2: " + palindrome2);
        }
        StringBuffer strBuffer = new StringBuffer(palindrome2);
        if (palindrome1.equalsIgnoreCase(strBuffer.reverse().toString())) {
            System.out.println("Palindrome: " + palindrome);
        } else
            System.out.println("!Not a palindrome: " + palindrome);
    }

    public static void palindromeSentenceOrNot5(String palindrome) {
        palindrome = palindrome.trim().replaceAll(",", "").replaceAll(" ", "");
        char[] arr = new char[palindrome.length()];
        try {
            palindrome.getChars(0, palindrome.length(), arr, 0);
            System.out.println(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
                System.out.println(arr);
            }
            String reverseString = String.valueOf(arr);
            System.out.println("ReverseString = " + reverseString);
            if (palindrome.equalsIgnoreCase(reverseString)) {
                System.out.println("Palindrome: " + palindrome);
            } else {
                System.out.println("!Not a palindrome: " + palindrome);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ATTENTION!! EXCEPTION!!");
        }
    }
}
