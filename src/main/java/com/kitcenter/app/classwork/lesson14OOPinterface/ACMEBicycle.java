package com.kitcenter.app.classwork.lesson14OOPinterface;

public class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newCadence) {
        this.cadence = newCadence;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public void changeSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    @Override
    public void changeAll(int newCadence, int newGear, int newSpeed) {
        this.speed = newSpeed;
        this.cadence = newCadence;
        this.gear = newGear;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + ", " + "Speed: " + speed + ", " + "Gear: " + gear);
    }

}
