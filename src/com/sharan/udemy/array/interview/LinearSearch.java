package com.sharan.udemy.array.interview;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20};
        linearSearch(array, 11);
    }

    // search method
    public static void linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Target was found at array index: " + i);
            }
        }
    }
}
