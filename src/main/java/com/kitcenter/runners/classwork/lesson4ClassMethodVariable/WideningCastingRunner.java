package com.kitcenter.runners.classwork.lesson4ClassMethodVariable;

import com.kitcenter.app.classwork.lesson4ClassMethodVariable.WideningCasting;

public class WideningCastingRunner {
    public static void main(String[] args) {
        WideningCasting casting = new WideningCasting();
        byte byte1 = 127;
        double double2 = casting.widening(byte1);
    }
}
