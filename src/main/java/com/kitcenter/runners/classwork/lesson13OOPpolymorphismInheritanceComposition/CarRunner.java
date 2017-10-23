package com.kitcenter.runners.classwork.lesson13OOPpolymorphismInheritanceComposition;

import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Car;
import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Engine;

public class CarRunner {
    public static void main(String[] args) {
        Engine v12 = new Engine("V12");
//        Car bmw = new Car();
//        bmw.setEngine(v12);
        Car bmw = new Car(v12);
        System.out.println(bmw.getEngine().getName());
    }
}
