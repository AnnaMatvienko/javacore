package com.kitcenter.app.classwork.lesson12oopEncapsulationInheritance;

public class StudentGetterSetter extends Person {
    private String response;
    private String university;
    private String faculty;
    private int age;

    public StudentGetterSetter(String name, String university, String faculty, String response, int age) {
        super(name);
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getResponse() {
        return response;
    }

    public String getUniversity() {
        return university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public static void allDataDisplayed() {
        System.out.println("Hello!");
        System.out.println("My university is named DASOA.");
        System.out.println("My faculty is named Economical Cybernetics faculty.");
        System.out.println("I'm 18.");
    }
}