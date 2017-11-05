package com.kitcenter.runners.homework.lesson10_11FileException;

import com.kitcenter.app.homework.lesson10_11FileException.SortArrayFromToFile;

import java.io.IOException;

public class SortArrayFromToFileRunner {
    public static void main(String[] args) throws IOException {
        SortArrayFromToFile sortArray = new SortArrayFromToFile("D:\\KIT\\javacore\\src\\main\\resources\\readFrom.txt", "D:\\KIT\\javacore\\src\\main\\resources\\writeTo.txt");
        sortArray.processFile();
    }
}
