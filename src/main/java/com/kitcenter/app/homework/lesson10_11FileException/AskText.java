package com.kitcenter.app.homework.lesson10_11FileException;

import java.io.*;
import java.util.Scanner;

public class AskText {
    private String file;
    private String line;

    public AskText(String file) {
        this.file = file;
    }

    public void askText() {
        try {
            Scanner scan = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(file, false)));
            do {
                line = scan.nextLine();
                System.out.println(line);
                writer.append(line);
                writer.newLine();
            }
            while (!line.equalsIgnoreCase("Exit"));
            System.out.println("You choose stopping writing to the file.");
            writer.close();
            System.exit(0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
