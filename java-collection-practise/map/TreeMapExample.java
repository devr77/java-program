package com.alphaolomi.map;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

class TreeMapExample {

    public static void main(String[] args) {

        /* This is how to declare TreeMap */
        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();

        /*Adding elements to TreeMap*/
        integerStringTreeMap.put(1, "Data1");
        integerStringTreeMap.put(23, "Data2");
        integerStringTreeMap.put(70, "Data3");
        integerStringTreeMap.put(4, "Data4");
        integerStringTreeMap.put(2, "Data5");

        /* Display content using Iterator*/
        Set set = integerStringTreeMap.entrySet();
        for (Object o : set) {
            Map.Entry menuEntry = (Map.Entry) o;
            System.out.print("key is: " + menuEntry.getKey() + " & Value is: ");
            System.out.println(menuEntry.getValue());
        }

    }
}