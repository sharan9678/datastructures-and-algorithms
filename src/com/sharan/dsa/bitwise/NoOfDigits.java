package com.sharan.dsa.bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1; //log of n to the base of b

        System.out.println(ans);
    }
}
