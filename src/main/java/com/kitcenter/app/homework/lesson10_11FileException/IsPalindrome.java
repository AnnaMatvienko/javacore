package com.kitcenter.app.homework.lesson10_11FileException;

import com.kitcenter.app.homework.Lesson9SwitchString.PalindromeOrNot;

import java.io.*;

public class IsPalindrome {
    private String readFile;
    private String writeFile;
    public String line;

    public IsPalindrome(String readFile, String writeFile) {
        this.readFile = readFile;
        this.writeFile = writeFile;
    }

    public void isPalindrome() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(readFile));
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(writeFile, false)));

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String res = PalindromeOrNot.palindromeOrNot2(line);
                writer.append(res);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
