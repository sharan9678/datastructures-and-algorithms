package com.sharan.dsa.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {

    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int i = start; i <= end; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // if the element is not found
        return -1;
    }
}
