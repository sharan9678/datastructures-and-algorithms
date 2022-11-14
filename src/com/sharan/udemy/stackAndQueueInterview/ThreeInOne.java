package com.sharan.udemy.stackAndQueueInterview;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        values = new int[stackCapacity * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    // isFull
    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    // push
    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("The stack is full!");
        } else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    // pop
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek method
    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return values[indexOfTop(stackNum)];
        }
    }
}
