package com.alphaolomi.set;

import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {

        // TreeSet of String Type
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to TreeSet<String>
        treeSet.add("ABC");
        treeSet.add("String");
        treeSet.add("Test");
        treeSet.add("Pen");
        treeSet.add("Ink");
        treeSet.add("Jack");

        //Displaying TreeSet
        //
        System.out.println(treeSet);

        // TreeSet of Integer Type
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        // Adding elements to TreeSet<Integer>
        treeSet1.add(88);
        treeSet1.add(7);
        treeSet1.add(101);
        treeSet1.add(0);
        treeSet1.add(3);
        treeSet1.add(222);
        System.out.println(treeSet1);
    }
}