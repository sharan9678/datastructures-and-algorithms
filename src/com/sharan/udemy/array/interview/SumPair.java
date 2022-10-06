package com.sharan.udemy.array.interview;

import java.util.Scanner;

public class SumPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {2,6,3,9,11,7,5,4,10};

        System.out.println("Enter the target number:");
        int target = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("[" + array[i] + ", " + array[j] + "]");
                }
            }
        }
    }
}
