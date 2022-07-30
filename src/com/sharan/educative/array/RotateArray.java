package com.sharan.educative.array;

import java.util.*;

public class RotateArray {
    static void reverseArray(List<Integer> nums, int start, int end) {
        while (start < end) {
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end,temp);
            start++;
            end--;
        }
    }

    static void rotateArray(List<Integer> nums, int n) {
        int len = nums.size();
        n = n % len;
        if (n < 0) {
            n = n + len;
        }
        reverseArray(nums, 0, len-1);
        reverseArray(nums, 0, n-1);
        reverseArray(nums, n, len-1);
    }

    static void rotateArray2(List<Integer> nums, int n) {
        int len = nums.size();
        // normalizing the array
        n = n % len;
        if (n < 0) {
            n = n + len;
        }
        List<Integer> temp = new ArrayList<>();
        // copy the last n items into temp
        for (int i = len - n; i < len; i++) {
            temp.add(nums.get(i));
        }
        // shift the original array
        for (int i = len - 1; i >= n; i--) {
            nums.set(i, nums.get(i - n));
        }
        // copy temp into original array
        for (int i = 0; i < n; i++) {
            nums.set(i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 10, 20, 0, 59, 86, 32, 11, 9, 40);
        System.out.println("Array Before Rotation\n" + nums);
        rotateArray2(nums, 2);
        System.out.println("Array After 2 Rotations\n" + nums);
    }
}
