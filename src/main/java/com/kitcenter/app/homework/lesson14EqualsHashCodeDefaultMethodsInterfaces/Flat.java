package com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

public class Flat {
    private int roomsQuantity;
    private int number;
    private int tvQuantity;
    private int sofaQuantity;
    private int wardrobeQuantity;
    private int tableQuantity;
    private int chairsQuantity;
    private static final int MAX_TABLEWARE_QUANTITY = 12;
    private Tableware[] arr = new Tableware[MAX_TABLEWARE_QUANTITY];
    private int currentTablewareQuantity = 0;

    public Flat(int number, int roomsQuantity) {
        this.number = number;
        this.roomsQuantity = roomsQuantity;
        tvQuantity = 0;
        sofaQuantity = 0;
        wardrobeQuantity = 0;
        tableQuantity = 0;
        chairsQuantity = 0;
    }

    public void showFlat() {
        System.out.println("The flat number is " + number);
        System.out.println("There is " + roomsQuantity + " room(-s) in the flat.");
        if (tvQuantity > 0) {
            System.out.println("TV quantity is: " + tvQuantity);
        }
        if (sofaQuantity > 0) {
            System.out.println("Sofa quantity is: " + sofaQuantity);
        }
        if (wardrobeQuantity > 0) {
            System.out.println("Wardrobe quantity is: " + wardrobeQuantity);
        }
        if (tableQuantity > 0) {
            System.out.println("Table quantity is: " + tableQuantity);
        }
        if (chairsQuantity > 0) {
            System.out.println("Chairs quantity is: " + chairsQuantity);
        }
        for (int i = 0; i < currentTablewareQuantity; i++) {
            arr[i].showInfo();
        }
    }

    public void buyTV() {
        ++tvQuantity;
    }

    public void buySofa() {
        ++sofaQuantity;
    }

    public void buyWardrobe() {
        ++wardrobeQuantity;
    }

    public void buyTable() {
        ++tableQuantity;
    }

    public void buyChairs() {
        ++chairsQuantity;
    }

    public void buyTableware(Tableware item) {
        if (currentTablewareQuantity < MAX_TABLEWARE_QUANTITY) {
            arr[currentTablewareQuantity] = item;
            currentTablewareQuantity++;
        } else
            System.out.println("Exceed max tableware quantity!");
    }
}
