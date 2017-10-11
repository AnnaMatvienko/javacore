package com.kitcenter.runners.classwork.lesson12oopEncapsulationInheritanceRunner;

import com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance.BicycleConstructor;

public class BicycleConstructorRunner {
    public static void main(String[] args) {
        BicycleConstructor bicycle = new BicycleConstructor( 18, "sport", 30, "additional lights", "red");
        System.out.println(bicycle);
        BicycleConstructor bicycle2 = new BicycleConstructor(45, 10);
        System.out.println(bicycle2);
    }
}
