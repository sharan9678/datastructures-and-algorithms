package com.sharan.udemy.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // declaring an array
        int[] intArray;

        // instantiating an array of size 3
        intArray = new int[3];

        // initializing an array tc: o(N)
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        // combining all the three above steps
        String[] stringArray = {"a", "b", "c"}; // tc: o(N)
    }
}
