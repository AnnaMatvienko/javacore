package com.kitcenter.runners.classwork.lesson16Collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println(m1.get("Zara"));
        System.out.println(" Map Elements");
        System.out.println("\t" + m1);
        m1.put("Zara", "9");
        System.out.println(m1.get("Zara"));
        System.out.println(" Map Elements");
        System.out.println("\t" + m1);
    }
}
