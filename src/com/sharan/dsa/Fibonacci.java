package com.sharan.dsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long p = 0;
        long i = 1;
        long count = 2;

        while (count <= n) {
            long temp = i;
            i += p;
            p = temp;
            count++;
        }

        System.out.println(i);
    }
}
