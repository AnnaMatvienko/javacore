package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public abstract class SportsClub {
    private String name;
    private String location;

    public SportsClub(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public abstract int wins();

    public abstract int draws();

    public abstract int defeats();

    public void showName() {
        System.out.println("Sports club name is: " + name);
    }

    public void showLocation() {
        System.out.println("Sports club location is: " + location);
    }

    public void showStatistic() {
        System.out.println("Statistics: Wins: " + wins());
        System.out.println("Statistics: Draws: " + draws());
        System.out.println("Statistics: Defeats: " + defeats());
    }
}
