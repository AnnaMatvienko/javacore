package com.kitcenter.runners.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.FootballClub;
import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.SportsClub;

public class FootballClubRunner {
    public static void main(String[] args) {
        SportsClub footballClub = new FootballClub("Athletic", "Kyiv", 20, 5, 1);
        footballClub.showName();
        footballClub.showLocation();
        footballClub.showStatistic();
    }
}
