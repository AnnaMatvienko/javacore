package com.kitcenter.app.classwork.lesson14OOPinterface;


import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String passport;

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
}

