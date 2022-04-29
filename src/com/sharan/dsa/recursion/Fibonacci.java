package com.sharan.dsa.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibonacci(4);
        System.out.println(ans);
    }

    static int fibonacci(int number) {
        // base condition
         if (number < 2) {
            return number;
        }
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    static void multiply(int num1, int num2) {

    }
}
