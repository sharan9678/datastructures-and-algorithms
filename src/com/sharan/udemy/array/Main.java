package com.sharan.udemy.array;

public class Main {
    public static void main(String[] args) {
        SingleDimensionalArray singleDimensionalArray = new SingleDimensionalArray(10);

        singleDimensionalArray.insert(1, 1);
        singleDimensionalArray.insert(2, 2);
        singleDimensionalArray.insert(3, 3);

        singleDimensionalArray.traverse();
    }
}
