package com.kitcenter.app.homework.lesson4ClassMethodVariable;


import org.junit.Assert;
import org.junit.Test;

public class PrimitiveConverterTest {
    @Test // JUnit framework annotation
    public void PrimitiveConverterTest() {
        PrimitiveConverter converter = new PrimitiveConverter();
        float f1 = 567.765f;
        int int1 = 666, expRes3 = 126;
        char char1 = '~', expRes1 = (char) 568, expRes2 = 'ʚ';
        Assert.assertEquals(0, Character.compare(expRes1, converter.floatToChar(f1)));
        Assert.assertEquals(0, Character.compare(expRes2, converter.intToChar(int1)));
        Assert.assertEquals(expRes3, converter.charToInt(char1));
    }
}