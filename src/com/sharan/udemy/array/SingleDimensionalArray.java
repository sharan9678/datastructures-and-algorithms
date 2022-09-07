package com.sharan.udemy.array;

import java.util.Arrays;

public class SingleDimensionalArray {
    private int[] arr = null;

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("successfully inserted!");
            } else {
                System.out.println("this cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index to be accessed array!");
        }
        // tc: O(1)
    }

    public void display(int location) {
        System.out.println(arr[location]);
        // tc: O(1)
    }

    public void traverse() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println("Array at index " + i +
                        " is : " + arr[i]);
            }
        }
    }

    // search in array
    // linear search
    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("value found at index: " + i);
            } else {
                System.out.println("no such value");
            }
        }
        // tc: O(N)
    }

    // delete value from an array
    public void delete(int index) {
        try {
            if (arr[index] != Integer.MIN_VALUE) {
                arr[index] = Integer.MIN_VALUE;
                System.out.println("successfully deleted!");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("invalid index to access array");
        }
    }

    public void display() {
        System.out.println(Arrays.toString(arr));
    }
}
