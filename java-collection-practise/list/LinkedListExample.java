package com.alphaolomi.list;

import java.util.*;

class LinkedListExample {
    public static void main(String[] args) {

        /* Linked List Declaration */
        LinkedList<String> stringLinkedList = new LinkedList<>();

        /*add(String Element) is used for adding          * the elements to the linked list*/
        stringLinkedList.add("Item1");
        stringLinkedList.add("Item5");
        stringLinkedList.add("Item3");
        stringLinkedList.add("Item6");
        stringLinkedList.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + stringLinkedList);

        /*Add First and Last Element*/
        stringLinkedList.addFirst("First Item");
        stringLinkedList.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + stringLinkedList);

        /*This is how to get and set Values*/
        Object firstVar = stringLinkedList.get(0);
        System.out.println("First element: " + firstVar);

        stringLinkedList.set(0, "Changed first item");
        Object firstVar1 = stringLinkedList.get(0);
        System.out.println("First element after update by set method: " + firstVar1);

        /*Remove first and last element*/
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + stringLinkedList);

        /* Add to a Position and remove from a position*/
        stringLinkedList.add(0, "Newly added item");
        stringLinkedList.remove(2);
        System.out.println("Final Content: " + stringLinkedList);
    }
}