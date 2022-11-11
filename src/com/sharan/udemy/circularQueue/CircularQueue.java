package com.sharan.udemy.circularQueue;

public class CircularQueue {
    public int[] arr;
    public int topOfQueue;
    public int beginningOfQueue;
    public int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Circular Queue is successfully created with size: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    // isFull
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else if (beginningOfQueue == 0 &&
                topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    // enqueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The CQ is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            arr[++topOfQueue] = value;
            System.out.println("The value " + value + " successfully inserted into the queue.");
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("The value " + value + " successfully inserted into the queue.");
        }
    }

    // dequeue method
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The CQ is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The CQ is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // delete the queue
    public void deleteQueue() {
        arr = null;
        System.out.println("The CQ is successfully deleted!");
    }
}
