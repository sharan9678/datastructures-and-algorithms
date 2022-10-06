package com.sharan.udemy.array.interview;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int range = input.nextInt();
        int rangeSum = (range * (range + 1)) / 2;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20};
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        System.out.println("Missing number is " + (rangeSum -  arraySum));
    }
}
