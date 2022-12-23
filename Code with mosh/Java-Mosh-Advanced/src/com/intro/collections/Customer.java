package com.intro.collections;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;


    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        //this < other -> -1
        // this == other -> 0
        // this > other -> 1
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

