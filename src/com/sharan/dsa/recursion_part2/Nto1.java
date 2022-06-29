package com.sharan.dsa.recursion_part2;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(10);
    }

    static void fun(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }
}
