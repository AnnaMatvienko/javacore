package com.kitcenter.app.classwork.lesson14OOPinterface;

import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Teacher;

public class Mentor extends Teacher {
    public Mentor(String name) {
        super(name);
    }

    public String lessonFinished() {
        return "This lesson is finished, don't forget to do your homework!";
    }
}
