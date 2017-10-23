package com.kitcenter.runners.classwork.lesson12oopEncapsulationInheritanceRunner;

import com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance.StudentGetterSetter;

import static com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance.Person.ageIs;
import static com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance.Person.nameIs;
import static com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance.StudentGetterSetter.allDataDisplayed;

public class StudentGetterSetterRunner {
    public static void main(String[] args) {
        StudentGetterSetter student = new StudentGetterSetter("Anna", "DASOA", "cybernetics", "Hello", 18);
        nameIs();
        allDataDisplayed();
        ageIs(1980, 2017);
    }
}
