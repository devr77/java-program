package com.alphaolomi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapExample {

    public static void main(String[] args) {

        /* This is how to declare HashMap */
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        /*Adding elements to HashMap*/
        integerStringHashMap.put(12, "Chaitanya");
        integerStringHashMap.put(2, "Rahul");
        integerStringHashMap.put(7, "Singh");
        integerStringHashMap.put(49, "Ajeet");
        integerStringHashMap.put(3, "Anuj");

        /* Display content using Iterator*/
        printCollection(integerStringHashMap, "key is: ");

        /* Get values based on key*/
        String var = integerStringHashMap.get(2);
        System.out.println("Value at index 2 is: " + var);

        /* Remove values based on key*/
        integerStringHashMap.remove(3);
        System.out.println("Map key and values after removal:");
        printCollection(integerStringHashMap, "Key is: ");

    }

    private static void printCollection(HashMap<Integer, String> hmap, String s) {
        Set set = hmap.entrySet();
        for (Object o1 : set) {
            Map.Entry mapEntry = (Map.Entry) o1;
            System.out.print(s + mapEntry.getKey() + " & Value is: ");
            System.out.println(mapEntry.getValue());
        }
    }
}