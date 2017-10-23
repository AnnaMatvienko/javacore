package com.kitcenter.runners.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces;

import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.Cup;
import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.Dish;
import com.kitcenter.app.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.House;

public class HouseRunner {
    public static void main(String[] args) {
        House house = new House(3,5);
        house.getFlat(2,1).showFlat();
        house.getFlat(2,1).buyTV();
        house.getFlat(2,1).buySofa();
        house.getFlat(2,1).buyWardrobe();
        house.getFlat(2,1).buyTable();
        house.getFlat(2,1).buyChairs();
        house.getFlat(2,1).showFlat();
        house.getFlat(2,1).buyTableware(new Cup());
        house.getFlat(2,1).buyTableware(new Cup());
        house.getFlat(2,1).buyTableware(new Dish());
        house.getFlat(2,1).showFlat();
    }
}
