package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public class Tractor extends Machine {

    protected int weight;
    protected int wheelQuantity;

    public Tractor(String transportName, int currentSpeed, int weight, int wheelQuantity) {
        super(transportName, currentSpeed);
        this.weight = weight;
        this.wheelQuantity = wheelQuantity;
    }

    @Override
    public int getTransportSpeed() {
        System.out.println("Current speed is: " + currentSpeed);
        return currentSpeed;
    }

    @Override
    public int getTransportWeight() {
        System.out.println("The transport weight is: " + weight);
        return weight;

    }

    @Override
    public int getPassengersQuantity() {
        System.out.println("Maximum passengers quantity is: " + MAX_PASSENGERS_QUANTITY);
        return MAX_PASSENGERS_QUANTITY;
    }

    @Override
    public int getWheelQuantity() {
        System.out.println("Wheel quantity is: " + wheelQuantity);
        return wheelQuantity;
    }
}
