package com.sharan.dsa.recursion_part1;

public class Fibonacci {
    public static void main(String[] args) {
//        int ans = fibonacci(4);
//        System.out.println(ans);
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
    }

    static int fibonacci(int number) {
        // base condition
         if (number < 2) {
            return number;
        }
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    static int fiboFormula(int n) {
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
