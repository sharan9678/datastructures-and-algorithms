package com.sharan.dsa.linearsearch;

public class FindMin {
    public static void main(String[] args) {

    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
