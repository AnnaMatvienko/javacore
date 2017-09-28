package com.kitcenter.runners.classwork.lesson4ClassMethodVariable;

import com.kitcenter.app.classwork.lesson4ClassMethodVariable.CircleArea;

import java.util.Scanner;

public class CircleAreaRunner {
    public static void main(String[] args) {
        CircleArea area = new CircleArea();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 1st circle radius:");
        double radius1 = scanner.nextDouble();
        System.out.println("Please, enter 2nd circle radius:");
        double radius2 = scanner.nextDouble();
        double maxArea = area.calculateMaxArea(radius1, radius2);
        System.out.println("MaxArea = " + maxArea);
    }
}