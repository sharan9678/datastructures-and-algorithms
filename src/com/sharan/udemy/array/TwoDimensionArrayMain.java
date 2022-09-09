package com.sharan.udemy.array;

import java.util.Arrays;
import java.util.LinkedList;

public class TwoDimensionArrayMain {
    public static void main(String[] args) {
        // step-1: declare
        int[][] array;

        // step-2: instantiate
        array = new int[2][2];

        //step-3: initialize
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        // all together
        System.out.println(Arrays.deepToString(array)); // deep to string method is used to iterate through 2d array


    }
}
