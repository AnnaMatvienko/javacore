package com.kitcenter.runners.homework.lesson5UnitTesting;

import com.kitcenter.app.homework.lesson5UnitTesing.*;

import java.util.Scanner;

public class AllMathFuncsRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu number that should be executed:");
            System.out.println("1: Run MathAbs");
            System.out.println("2: Run MathAreaRectangle");
            System.out.println("3: Run MathAverage");
            System.out.println("4: Run MathBisector");
            System.out.println("5: Run MathCircuit");
            System.out.println("6: Run MathDivision");
            System.out.println("7: Run MathHeight");
            System.out.println("8: Run MathHypot");
            System.out.println("9: Run MathMax");
            System.out.println("10: Run MathMediana");
            System.out.println("11: Run MathMin");
            System.out.println("12: Run MathPerimeterRectangle");
            System.out.println("13: Run MathPow");
            System.out.println("14: Run MathRound");
            System.out.println("15: Run MathSphereArea");
            System.out.println("16: Run MathSphereVolume");
            System.out.println("17: Run MathSqrt");
            System.out.println("18: Run MathSquare");
            System.out.println("19: Run MathSubstraction");
            System.out.println("20: Run MathSum");
            System.out.println("21: Exit the menu");


            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, enter menu number to run: ");
                int menuNumber = scanner.nextInt();
                switch (menuNumber) {
                    case 1: {
                        int a = -15;
                        System.out.println("Absolute value = " + MathAbs.abs(a));
                        break;
                    }
                    case 2: {
                        int a = 3, b = 9;
                        System.out.println("Rectangle Area = " + MathAreaRectangle.areaRectangle(a, b));
                        break;
                    }
                    case 3: {
                        int a = 15, b = 10, c = 5;
                        System.out.println("Average value = " + MathAverage.average(a, b, c));
                        break;
                    }
                    case 4: {
                        double a = 9.0, b = 6.0, c = 3.0;
                        System.out.println("Bisector value = " + MathBisector.bisector(a, b, c));
                        break;
                    }
                    case 5: {
                        double r = 3.123;
                        System.out.println("Circuit value = " + MathCircuit.circuit(r));
                        break;
                    }
                    case 6: {
                        int a = 15, b = 3;
                        System.out.println("Division value = " + MathDivision.division(a, b));
                        break;
                    }
                    case 7: {
                        int a = 2, s = 15;
                        System.out.println("Height value = " + MathHeight.height(a, s));
                        break;
                    }
                    case 8: {
                        int a = 3, b = 4;
                        System.out.println("Hypot value = " + MathHypot.hypot(a, b));
                        break;
                    }
                    case 9: {
                        int a = 15, b = 3;
                        System.out.println("Max value = " + MathMax.max(a, b));
                        break;
                    }
                    case 10: {
                        double a = 3.3, b = 3.9, c = 3.12;
                        System.out.println("Mediana value = " + MathMediana.mediana(a, b, c));
                        break;
                    }
                    case 11: {
                        int a = 15, b = 3;
                        System.out.println("Min value = " + MathMin.min(a, b));
                        break;
                    }
                    case 12: {
                        int a = 3, b = 4;
                        System.out.println("Rectangle Perimeter value = " + MathPerimeterRectangle.perimeterRectangle(a, b));
                        break;
                    }
                    case 13: {
                        int a = 3, b = 3;
                        System.out.println("Pow value = " + MathPow.pow(a, b));
                        break;
                    }
                    case 14: {
                        double a = 3.88, b = 0.55;
                        System.out.println("Math Round value = " + MathRound.round(a, b));
                        break;
                    }
                    case 15: {
                        double r = 3.123;
                        System.out.println("Sphere Area value = " + MathSphereArea.sphereArea(r));
                        break;
                    }
                    case 16: {
                        double r = 3.123;
                        System.out.println("Sphere Volume value = " + MathSphereVolume.sphereVolume(r));
                        break;
                    }
                    case 17: {
                        int a = 9;
                        System.out.println("Sqrt value = " + MathSqrt.sqrt(a));
                        break;
                    }
                    case 18: {
                        int a = 9;
                        System.out.println("Square value = " + MathSquare.square(a));
                        break;
                    }
                    case 19: {
                        int a = 15, b = 3;
                        System.out.println("Substraction value = " + MathSubstraction.substraction(a, b));
                        break;
                    }
                    case 20: {
                        int a = 15, b = 3;
                        System.out.println("Sum value = " + MathSum.sum(a, b));
                        break;
                    }
                    case 21:
                        System.out.println("You choose exiting the menu, goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid menu item. Make another choice (1-21).");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error!! Only digits should be entered!!");
            }
        }
    }
}
