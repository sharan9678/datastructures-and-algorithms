package com.sharan.dsa.bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 16; // note: fix for n = 1
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
