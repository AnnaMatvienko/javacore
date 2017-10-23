package com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition;

public class Rose extends Flowers {
    private boolean isSingle;

    public Rose(String flowerColour, int flowerPrice, boolean isSingle) {
        super(flowerColour, flowerPrice);
        this.isSingle = isSingle;
    }

    @Override
    public String getFlowerName() {
        return "Rose";
    }
}
