package com.sharan.dsa.exam;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,4};
        int size = arr.length;
        System.out.println(numPairs(size, arr));
    }

    public static int numPairs(int n, int[] arr) {
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int num1 = arr[i];
                int num2 = arr[j];
                int num3, num4;
                if (num1 > num2) {
                    num3 = num1 - num2;
                } else {
                    num3 = num2 - num1;
                }
                num4 = num1 + num2;
                if (num1 >= num3 && num2 <= num4) {
                    count++;
                }
            }
        }
        return count;
    }
}
