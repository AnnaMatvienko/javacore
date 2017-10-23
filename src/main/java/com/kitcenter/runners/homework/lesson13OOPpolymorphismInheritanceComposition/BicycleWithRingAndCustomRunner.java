package com.kitcenter.runners.homework.lesson13OOPpolymorphismInheritanceComposition;

import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.Bicycle;
import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.BicycleWithRing;
import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.BicycleWithRingInterface;
import com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition.CustomBicycle;

public class BicycleWithRingAndCustomRunner {
    public static void main(String[] args) {
        BicycleWithRingInterface bwr = new BicycleWithRing();
        bwr.ring();
        Bicycle bic = new CustomBicycle();
        bic.ride();
        bic.setGear(4);
    }
}
