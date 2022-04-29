package com.sharan.dsa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from the user till user does not press x or X
        while (true) {
            // take operator as input
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                // perform the operation
                if (op == '+') {
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (op == '-') {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (op == '*') {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                } else if (op == '/') {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else if (op == '%') {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
            }
            if (op == 'x' || op == 'X') {
                break;
            }
        }
    }
}
