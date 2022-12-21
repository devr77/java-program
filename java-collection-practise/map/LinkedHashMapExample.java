package com.alphaolomi.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class LinkedHashMapExample {
    public static void main(String[] args) {
        // HashMap Declaration
        //
        LinkedHashMap<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();

        //Adding elements to LinkedHashMap
        integerStringLinkedHashMap.put(22, "Abey");
        integerStringLinkedHashMap.put(33, "Dawn");
        integerStringLinkedHashMap.put(1, "Sherry");
        integerStringLinkedHashMap.put(2, "Karon");
        integerStringLinkedHashMap.put(100, "Jim");

        // Generating a Set of entries
        Set set = integerStringLinkedHashMap.entrySet();

        // Displaying elements of LinkedHashMap
        //
        for (Object o : set) {
            Map.Entry me = (Map.Entry) o;
            System.out.print("Key is: " + me.getKey() + "& Value is: " + me.getValue() + "\n");
        }
    }
}