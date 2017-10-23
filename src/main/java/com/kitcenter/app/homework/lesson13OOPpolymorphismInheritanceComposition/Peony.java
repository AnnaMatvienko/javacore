package com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition;

public class Peony extends Flowers {

    private boolean isBud;

    public Peony(String flowerColour, int flowerPrice, boolean isBud) {
        super(flowerColour, flowerPrice);
        this.isBud = isBud;
    }

    @Override
    public String getFlowerName() {
        return "Peony";
    }
}
