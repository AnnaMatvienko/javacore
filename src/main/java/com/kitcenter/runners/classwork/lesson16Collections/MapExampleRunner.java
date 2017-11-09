package com.kitcenter.runners.classwork.lesson16Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapExampleRunner {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("Daizy", 31);
        hashMap.put("Al", 30);
        hashMap.put("Ma", 32);
        Set keys = hashMap.keySet();
        for (Object key : keys) {
        }
        Collection values = hashMap.values();
    }
}