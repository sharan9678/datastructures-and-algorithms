package com.sharan.udemy;

public class Recursion {
    /**
     * a way of solving a problem by having a function calling itself
     * performing the same operation multiple times with smaller inputs
     * every step we try similar input to make the problem smaller
     * base condition is needed to stop the recursion, otherwise infinite loop will occur
     * ------------------------------------------------------
     * why recursion?
     * break down big problem into smaller ones
     * ------------------------------------------------------
     * when to choose RECURSION?
     * if you can divide the problem into similar sub problems
     * ------------------------------------------------------
     * the logic behind RECURSION:
     * 1. a method calls itself
     * 2. exit from infinite loop
     *  static String recursionMethod(String[] parameters) {
     *         if (exit from condition statisfied) {
     *             return some value;
     *         } else {
     *             recursionMethod(modified parameters);
     *         }
     *  }
     */
    static void firstMethod() {
        secondMethod();
        System.out.println("i am the first method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("i am the second method");
    }

    static void thirdMethod() {
        System.out.println("i am the third method");
    }


    /**
     * to understand recursion in below method add a breakpoint to this method and debug
     * @param n
     */
    static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        recursiveMethod(5);
    }

    /**
     *
     */
}
