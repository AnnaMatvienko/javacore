package com.kitcenter.app.classwork.lesson10_11FileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputReader {
    public static void iReader() {
        try {
            String filepath = null;
            BufferedReader reader = new BufferedReader(
                    // new FileReader("D:\\input.txt"));
                    new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}


