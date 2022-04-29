package com.sharan.dsa.functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);

        System.out.println(a + " " + b);
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = num1;

        // this changes will be only valid in this function scope
    }
}
