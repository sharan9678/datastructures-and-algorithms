package com.sharan.dsa.exam;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1};
        System.out.println(mLIS(arr.length, arr));
    }

    static int mLIS(int length, int[] array) {
        int[] sorted = bubbleSort(array);
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i+1]) {
                count++;
            }
        }
        if (array[array.length - 2] != array[array.length - 1]) {
            count++;
        }
        return count;
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

}
