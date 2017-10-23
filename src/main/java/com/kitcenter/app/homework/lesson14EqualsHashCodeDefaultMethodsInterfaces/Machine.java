package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public abstract class Machine implements Run {
    protected String transportName;
    protected int currentSpeed;
    public static final int MAX_SPEED = 120;
    public static final int MIN_SPEED = 40;
    public static final int MIN_PASSENGERS_QUANTITY = 1;
    public static final int MAX_PASSENGERS_QUANTITY = 10;

    public Machine(String transportName, int currentSpeed) {
        this.transportName = transportName;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void showTransportName() {
        System.out.println("Transport name: " + transportName);
    }
}
