package com.sharan.dsa.binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 7, 7, 7, 8, 8, 9, 10};
        System.out.println(Arrays.toString(searchRange(array, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + nums) / 2; // might increase the int range
            int mid =  start + ((end - start) / 2);
            if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                // potential answer is found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
