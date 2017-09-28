package com.kitcenter.app.classwork.lesson4ClassMethodVariable;

public class CircleArea {
    public static final double PI = 3.14159265359;

    public double calculateMaxArea(double radius1, double radius2) {
        System.out.println("CircleArea::calculateMaxArea");
        double circleArea1 = PI * Math.pow(radius1, 2);
        System.out.println("Area1 is: " + circleArea1);
        double circleArea2 = PI * Math.pow(radius2, 2);
        System.out.println("Area2 is: " + circleArea2);
        if ((radius1 > radius2) || (circleArea1 > circleArea2)) {
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
            return (circleArea1);
        } else if (circleArea1 == circleArea2) {
            System.out.println("CircleAreas are equal");
            return (circleArea1);
        } else {
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");
            return (circleArea2);
        }
    }
}