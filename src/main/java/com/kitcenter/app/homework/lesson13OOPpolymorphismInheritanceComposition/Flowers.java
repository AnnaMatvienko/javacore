package com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition;

public abstract class Flowers {
    private String flowerColour;
    private int flowerPrice;

    public Flowers(String flowerColour, int flowerPrice) {
        this.flowerColour = flowerColour;
        this.flowerPrice = flowerPrice;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

    public abstract String getFlowerName();
}
