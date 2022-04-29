package com.sharan.dsa.arrays;

import java.util.Scanner;

public class Reverse {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        // get the number of test cases
        int test = scanner.nextInt();
        while (test > 0) {
            // get the number of elements in the array
            int numberOfElement = scanner.nextInt();

            int[] array = new int[numberOfElement];

            for (int i = 0; i < numberOfElement; i++) {
                array[i] = scanner.nextInt();
            }

            int[] answer = reverseArray(array);

            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }

            test--;
        }
    }

    static int[] reverseArray(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }

        return array;
    }
}
