package com.kitcenter.app.homework.lesson5UnitTesing;

public class MathBisector {
    public static double bisector(double a, double b, double c) {
        return ((Math.sqrt(a * b * (a + b + c) * (a + b - c)))) / (a + b);
    }
}