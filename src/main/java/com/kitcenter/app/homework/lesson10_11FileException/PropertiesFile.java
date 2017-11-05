package com.kitcenter.app.homework.lesson10_11FileException;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesFile {
    private String line;

    public void setPropertiesFile() {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            Scanner scan = new Scanner(System.in);
            output = new FileOutputStream("config.properties");
            do {
                System.out.println("Enter data to the properties file using format: key,value (separation by a comma is a must).");
                System.out.println("Or press Enter to quit writing to the properties file.");
                line = scan.nextLine();
                int commaIndex = line.indexOf(',');
                if (commaIndex == -1) {
                    if (!line.isEmpty()) {
                        System.out.println("Error: comma is absent in the line, re-write using the correct format.");
                    }
                } else {
                    String key = line.substring(0, commaIndex);
                    String value = line.substring(commaIndex + 1);
                    System.out.println("Key: " + key + "; Value: " + value);
                    prop.setProperty(key, value);
                }
            }
            while (!line.isEmpty());
            System.out.println("You choose stopping writing to the properties file.");
            prop.store(output, null);
            System.exit(0);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

