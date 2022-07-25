package com.sharan.dsa.staticExample;

public class StaticBlock {
    static int a = 14;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;

    }
}
