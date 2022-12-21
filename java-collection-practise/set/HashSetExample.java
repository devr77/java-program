package com.alphaolomi.set;

import java.util.HashSet;

@SuppressWarnings("OverwrittenKey")
class HashSetExample {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> stringHashSet = new HashSet<>();

        // Adding elements to the HashSet
        stringHashSet.add("Apple");
        stringHashSet.add("Mango");
        stringHashSet.add("Grapes");
        stringHashSet.add("Orange");
        stringHashSet.add("Fig");

        //Addition of duplicate elements
        stringHashSet.add("Apple");
        stringHashSet.add("Mango");

        //Addition of null values
        stringHashSet.add(null);
        stringHashSet.add(null);

        //Displaying HashSet elements
        System.out.println(stringHashSet);
    }
}