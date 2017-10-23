package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public class Dish implements Tableware {
    @Override
    public boolean isChina() {
        return false;
    }

    @Override
    public int getVolume() {
        return 500;
    }

    @Override
    public void showInfo() {
        System.out.println("Dish info: china: " + isChina() + " with volume: " + getVolume() + " ml.");
    }
}
