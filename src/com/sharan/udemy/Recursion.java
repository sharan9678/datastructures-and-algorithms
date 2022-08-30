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
    public static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }

    /**
     * recursive vs iterative
     * @param num
     */
    public static int powerOfTwo(int num) {
        int power;
        if (num == 0) {
            return 1;
        } else {
            power = 2 * powerOfTwo(num - 1);
            return power;
        }
    }

    public static int powerOfTwoIT(int num) {
        int i = 0;
        int power = 1;
        while (i < num) {
            power = power * 2;
            i++;
        }
        return power;
    }

    public static int factorial(int num) {
        // other constraints
        if (num < 1) {
            return -1;
        }
        // base conditions
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // recursive part
            return num * factorial(num - 1);
        }
    }

    public static int fibonacci(int num) {
        // unintentional case or other constraints
        if (num < 0) {
            return -1;
        }
        // base condition
        if (num == 1 || num == 0) {
            return num;
        } else {
            // recursive part
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    /**
     * this is used to find the sum of the digits in the given number
     * @param n is the number to which we need to find the sum
     * @return returns the sum of the digit using recursion
     */
    public static int sumOfDigit(int n) {
        // other constraint
        if (n < 0) {
            return -1;
        }
        // base condition
        if (n == 0) {
            return 0;
        }
        // recursive conditions
        return (n % 10) + sumOfDigit(n / 10);
    }


    /**
     * to the power of a given base and exponent
     * @param base is any integer number
     * @param exponent is any integer number
     * @return returns the power of a given integer using recursion
     */
    public static int power(int base, int exponent) {
        // other constraints
        if (exponent < 0) {
            return -1;
        }
        // base condition
        if (exponent == 0 || exponent == 1) {
            return base;
        }
        // recursive part
        return base * power(base, exponent - 1);
    }

    /**
     * this method is used to find the GCD/HCF of a given two number using euclidean algorithm
     * @param a number 1
     * @param b number 2
     * @return the gcd of given two number using recursion
     */
    public static int gcd(int a, int b) {
        // other constraints
        if (a < 0 || b < 0) {
            return -1;
        }
        // base condition
        if (b == 0) {
            return a;
        }
        // recursive part
        return gcd(b, a % b);
    }

    public static int decimalToBinary(int num) {
        // other constraints
        // base condition
        if (num == 0) {
            return 0;
        }
        // recursive part
        return num % 2 + 10 * decimalToBinary(num / 2);
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(12));
    }
}
