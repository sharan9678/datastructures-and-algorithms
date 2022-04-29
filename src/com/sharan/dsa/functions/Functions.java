package com.sharan.dsa.functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Q. take input of two numbers and print the sum
       sum();

       // using int return
       int sum = sum2();
       System.out.println(sum);

       // passing int as argument
       sum = sum3(23, 33);
       System.out.println(sum);

       String message = greet();
       System.out.println(message);
    }

    // using void return type
    public static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    // using integer return
    public static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // using arguments
    public static int sum3(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // using String return type
    public static String greet() {
        String greeting = "Good Morning!";
        return greeting;
    }
}
