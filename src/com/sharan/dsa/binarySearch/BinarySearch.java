package com.sharan.dsa.binarySearch;
/**
 * 1. find the middle element
 * 2. target > mid => search in the right else search in the left
 * 3. if middle element == target element then that's the ans
 * if start > end then element not found
 *
 */
public class BinarySearch {
    // binary search algorithm
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 9, 10, 11, 12, 14, 18, 19, 20, 36, 48}; // ascending order
        int[] array2 = {19, 12, 6, 5, 3, 2, -8, -18};   // descending order

        int target = 36;

        int ans = binarySearch(array, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might increase the int range
            int mid =  start + ((end - start) / 2);

            if (target < array[mid]) {
                end = mid -1;
            } else if (target > array[mid]){
                start = mid + 1;
            } else {
                // ans
                return mid;
            }
        }
        return -1;
    }
}
