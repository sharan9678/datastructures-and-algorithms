package com.sharan.dsa.bitwise;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] question = {
                {1,1,0},
                {1,0,0},
                {0,0,0}
        };
        int[][] ans = flipAndInvertImage(question);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse this array
            for (int i = 0; i < (image[row.length - 1].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[row.length - 1].length - i - 1] ^ 1;
                row[image[row.length - 1].length - i - 1] = temp;
            }
        }
        return image;
    }
}
