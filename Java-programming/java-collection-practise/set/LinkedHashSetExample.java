package com.alphaolomi.set;

import java.util.LinkedHashSet;

class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet of String Type
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        stringLinkedHashSet.add("Z");
        stringLinkedHashSet.add("PQ");
        stringLinkedHashSet.add("N");
        stringLinkedHashSet.add("O");
        stringLinkedHashSet.add("KK");
        stringLinkedHashSet.add("FGH");
        System.out.println(stringLinkedHashSet);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();

        // Adding elements
        integerLinkedHashSet.add(99);
        integerLinkedHashSet.add(7);
        integerLinkedHashSet.add(0);
        integerLinkedHashSet.add(67);
        integerLinkedHashSet.add(89);
        integerLinkedHashSet.add(66);
        System.out.println(integerLinkedHashSet);
    }
}