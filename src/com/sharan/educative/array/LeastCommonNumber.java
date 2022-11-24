package com.sharan.educative.array;

import java.util.Arrays;

class LeastCommonNumber {
    static Integer findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                for (int k = 0; k < arr3.length - 1; k++) {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && arr1[i] == arr3[k]) return arr1[i];
                }
            }
        }
        return -1;
    }

    static Integer findLeastCommonNumber2(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                return arr1[i];
            }
            if (arr1[i] < arr2[j] && arr1[i] < arr3[k]) {
                i++;
            } else if (arr2[j] < arr1[i] && arr2[j] < arr3[k]) {
                j++;
            } else if (arr3[k] < arr1[i] && arr3[k] < arr2[j]) {
                k++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] v1 = new int[] {6, 7, 10, 25, 30, 63, 64};
        int[] v2 = new int[] {0, 4, 5, 6, 7, 8, 50};
        int[] v3 = new int[] {1, 6, 10, 14};
        System.out.println("Array 1: " + Arrays.toString(v1));
        System.out.println("Array 2: " + Arrays.toString(v2));
        System.out.println("Array 3: " + Arrays.toString(v3));

        Integer result = findLeastCommonNumber2(v1, v2, v3);
        System.out.println("Least Common Number: " + result);
    }
}
