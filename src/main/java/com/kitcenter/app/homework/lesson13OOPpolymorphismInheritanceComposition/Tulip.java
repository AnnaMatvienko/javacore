package com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition;

public class Tulip extends Flowers {
    private boolean isSimple;

    public Tulip(String flowerColour, int flowerPrice, boolean isSimple) {
        super(flowerColour, flowerPrice);
        this.isSimple = isSimple;
    }

    @Override
    public String getFlowerName() {
        return "Tulip";
    }
}
