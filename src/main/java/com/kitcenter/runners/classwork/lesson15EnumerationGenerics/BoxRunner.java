package com.kitcenter.runners.classwork.lesson15EnumerationGenerics;

import com.kitcenter.app.classwork.lesson15EnumerationGenerics.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(21.0d);
    }
}
