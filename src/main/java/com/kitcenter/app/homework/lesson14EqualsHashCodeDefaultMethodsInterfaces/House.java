package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public class House {
    private int floorsQuantity;
    private int flatsQuantity;
    private Flat[][] arr;

    public House(int floorsQuantity, int flatsQuantity) {
        int currentFlatNumber = 1;
        this.floorsQuantity = floorsQuantity;
        this.flatsQuantity = flatsQuantity;
        arr = new Flat[floorsQuantity][flatsQuantity];
        for (int i = 0; i < floorsQuantity; i++) {
            for (int j = 0; j < flatsQuantity; j++) {
                arr[i][j] = new Flat(currentFlatNumber++, (int) ((Math.random() * 4) + 1));
                arr[i][j].showFlat();
            }
        }
    }

    public Flat getFlat(int floorNumber, int flatOrdinalNumber) {
        return arr[floorNumber][flatOrdinalNumber];
    }
}
