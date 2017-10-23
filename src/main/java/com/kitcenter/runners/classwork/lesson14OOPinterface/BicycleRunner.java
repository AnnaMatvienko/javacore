package com.kitcenter.runners.classwork.lesson14OOPinterface;

import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Car;
import com.kitcenter.app.classwork.lesson14OOPinterface.ACMEBicycle;
import com.kitcenter.app.classwork.lesson14OOPinterface.Bicycle;

public class BicycleRunner {
    public static void main(String args[]) {

        Object car = new Car();
        Car car1 = new Car();
        Object objCar1 = car1;
        car1 = (Car) objCar1;

        Bicycle bicycle = new ACMEBicycle();
        bicycle.changeCadence(1);
        bicycle.changeGear(3);
        bicycle.changeSpeed(200);

        Bicycle bicycle2 = new ACMEBicycle();
        bicycle2.changeAll(2, 5, 199);

        ACMEBicycle acmeBicycle = new ACMEBicycle();
        acmeBicycle.printStates();
        acmeBicycle.changeCadence(4);
        acmeBicycle.changeGear(4);
        acmeBicycle.changeSpeed(99);
        acmeBicycle.printStates();
    }
}
