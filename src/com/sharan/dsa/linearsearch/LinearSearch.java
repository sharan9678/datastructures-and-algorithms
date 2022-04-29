package com.sharan.dsa.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 23, 45, 67, 78, 98, 76, 66, 34, 99, 100};
        int target = 98;
        int answer = linearSearch(nums, target);
        System.out.println(answer);
    }
    // search in the array
    // return the index if item found else return -1
    static int linearSearch(int[] arr, int target) {
         if (arr.length == 0) {
             return -1;
         }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // if the element is not found
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // if the element is not found
        return Integer.MAX_VALUE;
    }

    // return true or false based on the value
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        // if the element is not found
        return false;
    }
}
