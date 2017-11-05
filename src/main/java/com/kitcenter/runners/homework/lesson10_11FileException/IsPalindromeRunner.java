package com.kitcenter.runners.homework.lesson10_11FileException;

import com.kitcenter.app.homework.lesson10_11FileException.IsPalindrome;

import java.io.IOException;

public class IsPalindromeRunner {
    public static void main(String[] args) throws IOException {
        IsPalindrome palindrome = new IsPalindrome("D:\\KIT\\javacore\\src\\main\\resources\\readFile.txt", "D:\\KIT\\javacore\\src\\main\\resources\\writeFile.txt");
        palindrome.isPalindrome();
    }
}
