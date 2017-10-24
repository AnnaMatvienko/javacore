package com.kitcenter.runners.classwork.lesson15EnumerationGenerics;

import com.kitcenter.app.classwork.lesson15EnumerationGenerics.MenuItem;
import com.kitcenter.app.homework.lesson5UnitTesing.MathAbs;
import com.kitcenter.app.homework.lesson5UnitTesing.MathAverage;
import com.kitcenter.app.homework.lesson5UnitTesing.MathMax;
import com.kitcenter.app.homework.lesson5UnitTesing.MathMin;

import java.util.Scanner;

public class MenuItemRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item that should be executed:");
            System.out.println("Run MathAbs");
            System.out.println("Run MathAverage");
            System.out.println("Run MathMax");
            System.out.println("Run MathMin");

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, enter menu item to run: ");
                String item = scanner.next();
                MenuItem menuItem = MenuItem.valueOf(item.toUpperCase());
                switch (menuItem) {
                    case MATHABS: {
                        int a = -15;
                        System.out.println("Absolute value = " + MathAbs.abs(a));
                        break;
                    }

                    case MATHAVERAGE: {
                        int a = 15, b = 10, c = 5;
                        System.out.println("Average value = " + MathAverage.average(a, b, c));
                        break;
                    }

                    case MATHMAX: {
                        int a = 15, b = 3;
                        System.out.println("Max value = " + MathMax.max(a, b));
                        break;
                    }

                    case MATHMIN: {
                        int a = 15, b = 3;
                        System.out.println("Min value = " + MathMin.min(a, b));
                        break;
                    }

                    default:
                        System.out.println("Invalid menu item. Make another choice.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error!! Only items from the list should be entered!!");
            }
        }
    }
}


