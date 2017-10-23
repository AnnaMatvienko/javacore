package com.kitcenter.runners.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.CaterpillarTractor;
import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.WheeledTractor;

public class TractorRunner {
    public static void main(String[] args) {
        WheeledTractor wheeledTractor = new WheeledTractor("Koloss", 45, 1200, 8);
        CaterpillarTractor caterpillarTractor = new CaterpillarTractor("Rodoss", 55, 1400, 0);
        wheeledTractor.showTransportName();
        wheeledTractor.getPassengersQuantity();
        wheeledTractor.getTransportSpeed();
        wheeledTractor.getTransportWeight();
        wheeledTractor.getWheelQuantity();
        caterpillarTractor.showTransportName();
        caterpillarTractor.getPassengersQuantity();
        caterpillarTractor.getTransportSpeed();
        caterpillarTractor.getTransportWeight();
        caterpillarTractor.getWheelQuantity();
    }
}
