package com.sharan.udemy;

import java.util.Arrays;

public class BigONotation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        sumAndProductOfArray(array);
        printPairs(array);
        printUnorderedPair(array);
        reverseAnArray(array);
        reverseAnArrayUsingRecursion(array, 0, 4);
        System.out.println(Arrays.toString(array));
        System.out.println(factorial(6));
    }

    public static void sumAndProductOfArray(int[] array) {
        int sum = 0;                // O(1)
        int product = 1;            // O(1)
        // to find the sum
        for (int j : array) {       // O(N)
            sum += j;               // O(1)
        }
        // to find the product
        for (int i : array) {       // O(N)
            product *= i;           // O(1)
        }
        // time complexity: O(N)
        System.out.println(sum + ", " + product);
    }

     public static void printPairs(int[] array) {
         for (int k : array) {                              // O(N)
             for (int i : array) {                          // O(N)
                 System.out.print(k + "" + i + " ");        // O(1)
             }
             System.out.println();
         }
         // time complexity: O(N^2)
     }

     public static void printUnorderedPair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i] + "" + array[j] + " ");
            }
            System.out.println();
        }
        // time complexity: O(n^2)
     }

     public static void printUnorderedPair(int[] arrayA, int[] arrayB) {
         for (int j : arrayA) {               // not n^2 coz two for loop is taking two different arrays
             for (int k : arrayB) {           // O(ab)
                 if (j < k) {
                     System.out.print(j + "" + k);
                 }
             }
             System.out.println();
         }
        // time complexity: O(ab)
         // a --> O(a)
         // b --> O(b)
     }
     public static void reverseAnArray(int [] array) {
        for (int i = 0; i < array.length / 2; i++) {                // O(N)
            int lastElement = array.length - i - 1;                 // O(1)
            int temp = array[i];                                    // O(1)
            array[i] = array[lastElement];                          // O(1)
            array[lastElement] = temp;                              // O(1)
        }
         System.out.println(Arrays.toString(array));
        // time complexity: O(N)
     }

     public static void reverseAnArrayUsingRecursion(int[] array, int start, int end) {
        // base condition
         if (start >= end)
             return;
         int temp = array[start];
         array[start] = array[end];
         array[end] = temp;
         reverseAnArrayUsingRecursion(array, start + 1, end - 1);
     }

     public static int factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 1;
        return n * factorial(n-1);
     }

     public static int powersOf2(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powersOf2(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
     }
}
