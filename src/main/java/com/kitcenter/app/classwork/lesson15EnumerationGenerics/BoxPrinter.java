package com.kitcenter.app.classwork.lesson15EnumerationGenerics;

public class BoxPrinter<T> {
    private T val;

    // T stands for "Type" – this is placeholder
    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
