package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public class FootballClub extends SportsClub {
    private int wins;
    private int draws;
    private int defeats;

    public FootballClub(String name, String location, int wins, int draws, int defeats) {
        super(name, location);
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
    }

    @Override
    public int wins() {
        return wins;
    }

    @Override
    public int draws() {
        return draws;
    }

    @Override
    public int defeats() {
        return defeats;
    }
}
