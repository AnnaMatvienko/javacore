package com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition;

import java.util.Objects;

public class Teacher extends Person {
    private String name;
    private int age;
    private int id;

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "Do not forget to make a homework";
    }

    @Override
    public void hello() {
        System.out.println("!!TSCHU:SS!!");
    }

    @Override
    public void bye() {
        System.out.println("!!Aufwiedersein!!");
    }

    public String lessonFinished() {
        return "Do not forget to make homework!";
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Teacher)) {
            return false;
        }
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(id, teacher.id);
    }

    public int hashCode() {
        return Objects.hash(name, age, id);

    }
}
