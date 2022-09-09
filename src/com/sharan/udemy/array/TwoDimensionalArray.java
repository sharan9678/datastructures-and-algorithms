package com.sharan.udemy.array;

import java.util.Arrays;

public class TwoDimensionalArray {
    private int[][] array = null;

    // constructor
    public TwoDimensionalArray(int rows, int cols) {
        this.array = new int[rows][cols];
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // inserting value in an array
    public void insert(int row, int col, int value) {
        try {
            if (array[row][col] == Integer.MIN_VALUE) {
                array[row][col] = value;
                System.out.println("value successfully inserted!");
            } else {
                System.out.println("the index is not empty!");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("invalid index to 3d array!");
        }
    }

    // display all the values in the array
    public void display() {
        System.out.println(Arrays.deepToString(array));
    }

    // display a particular value in the array
    // access the cell value from a given array
    public void display(int row, int col) {
        try {
            System.out.println(array[row][col]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("invalid index!");
        }
    }

    // searching for a value in the array
    public void search(int value) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == value) {
                    System.out.println("found the value at array[" + row +
                            "][" + col + "]!");
                    return;
                }
            }
        }
        System.out.println("value is not found!");
        // tc: O(MN)
    }

    // deleting an index value from the array
    public void delete(int row, int col) {
        try {
            if (array[row][col] == Integer.MIN_VALUE) {
                System.out.println("index already empty!");
            } else {
                array[row][col] = Integer.MIN_VALUE;
                System.out.println("successfully deleted!");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("invalid index values!");
        }
    }
}
