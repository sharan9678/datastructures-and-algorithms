package com.sharan.dsa.binarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 17;
        int ans = ceiling(array, target);
        System.out.println(ans);
    }

    // return the index of the smallest number >= target
    // return -1 if it does not exist
    static int ceiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might increase the int range
            int mid =  start + ((end - start) / 2);

            if (target < array[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return array[start % array.length];
    }
}
