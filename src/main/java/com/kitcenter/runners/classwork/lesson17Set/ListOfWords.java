package com.kitcenter.runners.classwork.lesson17Set;

import java.util.*;

public class ListOfWords {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words (make some of them to be the same):");
        String str = scanner.next();
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        String str4 = scanner.next();
        hs.add(str);
        hs.add(str1);
        hs.add(str2);
        hs.add(str3);
        hs.add(str4);
        System.out.println(hs);

        HashMap hm = new HashMap();
        System.out.println("Enter common words to store a list of words:");
        String str5 = scanner.next();
        String str6 = scanner.next();
        String str7 = scanner.next();
        String str8 = scanner.next();
        String str9 = scanner.next();
        String str10 = scanner.next();
        hm.put(str5, str6);
        hm.put(str7, str8);
        hm.put(str9, str10);
        System.out.println("Entry Set: " + hm.entrySet());
        System.out.println(hm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("size", 2);
        tm.put("height", 160);
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) {
                    return 0;
                } else if (o1.equals(o2)) {
                    return 1;
                } else return -1;
            }
        };
        System.out.println(tm.values());
        System.out.println(comparator.compare("size", "height"));
    }
}