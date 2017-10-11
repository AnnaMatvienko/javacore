package com.kitcenter.app.classwork.lesson10_11FileException;

public class GetFilePath {
    public String getFilePath(String name) {
        return getClass().getClassLoader().getResource(name).getPath();
    }
}
