package com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public static void nameIs() {
        System.out.println("My name is Anna!");
    }

    public static final int ageIs(int birthdate, int today) {
        int age = today - birthdate;
        System.out.println(age);
        return age;
    }
}
