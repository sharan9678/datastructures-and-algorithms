package com.sharan.udemy.stack;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("the stack is created with size of: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }

    // isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        }
        return false;
    }

    // push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full!");
        } else {
            arr[++topOfStack] = value;
            System.out.println("The value " + value + " successfully inserted to the stack!");
        }
    }

    // pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            int item = arr[topOfStack--];
            return item;
        }
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    // delete stack method
    public void deleteStack() {
        arr = null;
        System.out.println("The Stack is successfully deleted!");
    }
}
