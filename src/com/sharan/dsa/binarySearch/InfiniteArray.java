package com.sharan.dsa.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {

    }

    static int ans(int[] arr, int target) {
        // first find the range
        // start with the box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1;
            // double the box value
            // end = previous end + sizeOfBox * 2
            // size of the box = end - start + 1
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] array, int target, int start, int end) {
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
