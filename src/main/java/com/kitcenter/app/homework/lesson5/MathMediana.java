package com.kitcenter.app.homework.lesson5;

public class MathMediana {
    public static double mediana(double a, double b, double c) {
        return (0.5 * (Math.sqrt(2 * a * a + 2 * b * b - c * c)));
    }
}
