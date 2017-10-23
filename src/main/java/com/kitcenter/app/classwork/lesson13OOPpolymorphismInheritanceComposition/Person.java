package com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void bye();

    public String getResponse(String question) {
        return "My answer is " + question;
    }

    public void hello() {
        System.out.println("!!!HELLO!!!");
    }

}
