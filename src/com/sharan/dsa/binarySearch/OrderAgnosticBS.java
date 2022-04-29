package com.sharan.dsa.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 9, 10, 11, 12, 14, 18, 19, 20, 36, 48}; // ascending order
        int[] array2 = {36, 19, 12, 6, 5, 3, 2, -8, -18};   // descending order

        int target = 36;

        int ans = orderAgnosticBS(array, target);
        int ans2 = orderAgnosticBS(array2, target);
        System.out.println(ans + " " + ans2);
    }

    static int orderAgnosticBS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // find whether array is sored in ascending or descending
        boolean isAscending = array[start] < array[end];

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might increase the int range
            int mid =  start + ((end - start) / 2);

            if (array[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < array[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
