package com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void show() {
    }

    @Override
    public void bye() {
        System.out.println("!!!Goodbye!!!");
    }

    @Override
    public void hello() {
        System.out.println("!!!OLA!!!");
    }

    @Override
    public String getResponse(String question) {
        return "Eh, What is a question";
    }

    @Override
    public String toString() {
        return "Student " + "name=" + name;
    }
}
