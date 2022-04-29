package com.sharan.dsa.functions;

public class StringChange {
    public static void main(String[] args) {
        String name = "Sharan Raj";
        changeName(name);
        System.out.println(name);
    }

    public static void changeName(String naam) {
        naam = "String changed"; // creating a new object, we cannot change strings since it is immutable
    }
}
