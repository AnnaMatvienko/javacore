package com.kitcenter.runners.classwork.lesson10_11FileExceptionRunner;

import com.kitcenter.app.classwork.lesson10_11FileException.GetFilePath;

public class GetFilePathRunner {
    public static void main(String[] args) {
        GetFilePath getPath = new GetFilePath();
        String filepath = getPath.getFilePath("input.txt");
        System.out.println(filepath);
    }

}
