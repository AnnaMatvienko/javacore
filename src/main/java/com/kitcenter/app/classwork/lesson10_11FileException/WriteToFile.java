package com.kitcenter.app.classwork.lesson10_11FileException;

import java.io.*;

public class WriteToFile {
    public static void writeToFile() {
        String firstLine = "The first line";
        String secondLine = "The second line";
        try {
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:\\output.txt", true)));
            writer.append(firstLine);
            writer.newLine();
            writer.append(secondLine);
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Just to be displayed");
        }
        String windowsStyle = "dir\\somefile.txt";
        String currentDir = System.getProperty("user.dir");
        File file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());
    }
}
