package com.sharan.educative.array;

import java.util.Arrays;

class FindLowHigh {
    static int findLowIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = high / 2;
        while (low <= high) {
            int midElem = nums[mid];
            if (midElem < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        if (low < nums.length && nums[low] == target) {
            return low;
        }
        return -1;
    }
    static int findHighIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = high / 2;
        while (low <= high) {
            int midElem = nums[mid];
            if (midElem <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        if (high == -1) {
            return high;
        }
        if (high < nums.length && nums[high] == target) {
            return high;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        System.out.println("Original List: " + Arrays.toString(nums) + "\n");

        int target = 5;
        int low = findLowIndex(nums, target);
        int high = findHighIndex(nums, target);
        System.out.println("Low Index of " + target + ": " + low);
        System.out.println("High Index of " + target + ": " + high);

        System.out.println();

        target = -2;
        low = findLowIndex(nums, target);
        high = findHighIndex(nums, target);
        System.out.println("Low Index of " + target + ": " + low);
        System.out.println("High Index of " + target + ": " + high);
    }
}

