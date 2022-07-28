package com.sharan.dsa.abstractDemo;

public abstract class Parent {
    abstract void career (String name);
    abstract void partner(String name, int age);
    static void hello() {
        System.out.println("Hello this is a message from the abstract parent class.");
    }

    public void normal() {
        System.out.println("This is a normal method");
    }
}
