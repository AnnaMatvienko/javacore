package com.kitcenter.app.classwork.lesson4;

import java.util.Scanner;

public class CircleArea {
    public static void calculate() {
        double pi = 3.14159265359;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 1st circle radius:");
        double radius1 = scanner.nextDouble();
        double circleArea1 = pi * Math.pow(radius1, 2);
        System.out.println("Area is: " + circleArea1);
        System.out.println("Please, enter 2nd circle radius:");
        double radius2 = scanner.nextDouble();
        double circleArea2 = pi * Math.pow(radius2, 2);
        System.out.println("Area is: " + circleArea2);
//        if (circleArea1 > circleArea2) {
//            System.out.print("CircleArea1 is bigger");
//        } else if (circleArea1 == circleArea2) {
//            System.out.print("CircleAreas are equal");
//        } else {
//            System.out.print("CircleArea2 is bigger");
//        }
        if ((radius1>radius2)||(circleArea1>circleArea2)) {
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        } else {
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");
        }
    }
}
