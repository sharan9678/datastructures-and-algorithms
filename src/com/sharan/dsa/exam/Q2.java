package com.sharan.dsa.exam;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {5,1,5,8,6,9};
        int length = arr.length;
        System.out.println(mLIS(length, arr));
    }

    public static int mLIS(int length, int[] nums) {
        int[] maxLength = new int[length];
        Arrays.fill(maxLength, 1);
        for(int i = 1; i < length; i++) {
            for(int j = 0; j <=i; j++) {
                if(nums[j] >= nums[i]) {
                    continue;
                }

                maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
            }
        }

        return Arrays.stream(maxLength).max().orElse(1) + 1;
    }
}
