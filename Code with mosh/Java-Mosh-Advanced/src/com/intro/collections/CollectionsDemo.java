package com.intro.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show () {
        Collection<String> collection = new ArrayList<> ();
        Collections.addAll(collection, "a", "b", "c");

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
        }
    }

