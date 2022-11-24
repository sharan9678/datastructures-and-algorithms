package com.sharan.educative.array;

import java.util.Arrays;

public class MoveZeros {
    static void moveZerosToLeft(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int writeIndex = nums.length - 1;
        int readIndex = nums.length - 1;
        while (readIndex >= 0) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
        while (writeIndex >= 0) {
            nums[writeIndex] = 0;
            writeIndex--;
        }
    }

    public static void main(String[] args) {
        int[][] numsList = {{1, 10, 20, 0, 59, 63, 0, 88, 0}, {1, 0, 2, 3, 0}, {0},
                {-1, 0, 0, -2, 9}, {1, 2, 3, 4, 5}, {2}};

        for (int i = 0; i < numsList.length; i++) {
            System.out.println((i + 1) + ". Before list:\t" + Arrays.toString(numsList[i]));
            moveZerosToLeft(numsList[i]);
            System.out.println("   After list:\t" + Arrays.toString(numsList[i]));
            System.out.println(
                    "----------------------------------------------------------------------------------------------------\n");
        }
    }
}
