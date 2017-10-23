package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public class Cup implements Tableware {
    @Override
    public boolean isChina() {
        return true;
    }

    @Override
    public int getVolume() {
        return 250;
    }

    @Override
    public void showInfo() {
        System.out.println("Cup info: china: "+isChina()+" with volume: "+getVolume()+" ml.");
    }
}
