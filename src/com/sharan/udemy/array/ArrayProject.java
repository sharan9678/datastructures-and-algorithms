package com.sharan.udemy.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number of days from the user
        System.out.println("How many day's temperature?");
        int noOfDays = input.nextInt();

        // declare and initialize array
        int[] tempReadings = new int[noOfDays];
        int sum = 0;

        // get the reading for each day
        for (int i = 0; i < noOfDays; i++) {
            System.out.println("Day " + (i+1) + "s high temp:");
            tempReadings[i] = input.nextInt();
            sum += tempReadings[i];
        }

        // display the contents of the array
        System.out.println("Average = " + (sum / noOfDays));
    }
}
