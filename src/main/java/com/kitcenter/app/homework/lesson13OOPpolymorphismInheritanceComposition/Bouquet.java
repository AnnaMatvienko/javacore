package com.kitcenter.app.homework.lesson13OOPpolymorphismInheritanceComposition;

public class Bouquet {
    private static final int MAX_FLOWERS = 11;
    private Flowers[] arr = new Flowers[MAX_FLOWERS];
    private int currentFlowersQuantity = 0;

    public void addFlower(Flowers flower) {
        if (currentFlowersQuantity < MAX_FLOWERS) {
            arr[currentFlowersQuantity] = flower;
            currentFlowersQuantity++;
        } else
            System.out.println("Exceed max bouquet size!");
    }

    public int getPrice() {
        int totalPrice = 0;
        for (int i = 0; i < currentFlowersQuantity; i++) {
            System.out.println(i + ": price: " + arr[i].getFlowerPrice() + " flower name: " + arr[i].getFlowerName());
            totalPrice = totalPrice + arr[i].getFlowerPrice();
        }
        return totalPrice;
    }
}
