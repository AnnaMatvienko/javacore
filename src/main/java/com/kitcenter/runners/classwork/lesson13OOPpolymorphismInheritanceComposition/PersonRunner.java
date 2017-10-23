package com.kitcenter.runners.classwork.lesson13OOPpolymorphismInheritanceComposition;


import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Person;
import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Student;
import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Teacher;

public class PersonRunner {
    public static void main(String[] args) {
        Person student = new Student("Sergii");
        System.out.println(student);
        Person teacher = new Teacher("Teacher");
        student.getResponse("student");
        teacher.getResponse("teacher");
        response(student, "student");
        response(teacher, "teacher");
        Student student1 = new Student("Student1");
    }

    public static void response(Person person, String questionResponce) {
        person.getResponse(questionResponce);
        person.hello();
        person.bye();
    }
}
