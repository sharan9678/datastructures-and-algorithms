package com.sharan.educative.array;

import java.util.Arrays;

public class RecursiveBinarySearch {
    static int binarySearchRec(int[] nums, int target, int low, int high) {
       if (low > high) {
           return -1;
       }
       int mid = low + ((high - low) / 2);
       if (nums[mid] == target) {
           return mid;
       } else if (target < nums[mid]) {
           return binarySearchRec(nums, target, low, mid - 1);
       } else {
           return binarySearchRec(nums, target, mid + 1, high);
       }
    }

    static int binarySearch(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[][] numbsLists = {{}, {0, 1}, {1, 2, 3}, {-1, 0, 3, 5, 9, 12}, {-1, 0, 3, 5, 9, 12}};
        int[] targetList = {12, 1, 3, 9, 2};
        for (int i = 0; i < numbsLists.length; i++) {
            int[] numbs = numbsLists[i];
            int target = targetList[i];
            int index = binarySearch(numbs, target);
            System.out.println(i + 1 + ". Array to search: " + Arrays.toString(numbs));
            System.out.println("   Target: " + targetList[i]);
            if (index != -1) {
                System.out.println("   " + target + " exists in the array and its index is " + index);
            } else {
                System.out.println("   " + target + " does not exist in the array so the return value is " + index);
            }
            System.out.println(
                    "----------------------------------------------------------------------------------------------------\n");
        }
    }
}
