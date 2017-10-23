package com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition;

public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {
    @Override
    public void ring() {
        System.out.println("Di-ling!");
    }
}
