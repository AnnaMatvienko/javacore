package com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance;

public class BicycleConstructor { //class name
    private int wheelSize;
    private String color;
    private int ownerAge;
    private String usageType;
    private String extensions;
    private int weight;//variable

    public BicycleConstructor(int wheelSize, String color) { // constructor with args
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public BicycleConstructor(int wheelSize) { // constructor with args
        this(); // call no-args constructor
        this.wheelSize = wheelSize;
    }

    public BicycleConstructor() { // no-args constructor
        this.wheelSize = 26;
        this.color = "red";
    }

    public BicycleConstructor(int ownerAge, String usageType, int weight, String extensions, String color) {
        this.ownerAge = ownerAge;
        this.usageType = usageType;
        this.weight = weight;
        this.extensions = extensions;
        this.color = color;
    }

    public BicycleConstructor(int weight, int ownerAge) {
        this.weight = weight;
        this.ownerAge = ownerAge;
        this.wheelSize = 25;
    }

    public String ride() { // method
        return "Wroom!";
    }
}
