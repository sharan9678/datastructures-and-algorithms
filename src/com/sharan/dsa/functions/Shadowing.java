package com.sharan.dsa.functions;

/*
* NOTE:
* Shadowing in java is using two variable with same name under the same scope which overlaps
* shadowing begins where the local variable is initialised
* scope will begin when the value is initialised
* */
public class Shadowing {
    static int x = 90; // this will be shadowed at line number 8

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // the class variable at line 4 is being shadowed
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
