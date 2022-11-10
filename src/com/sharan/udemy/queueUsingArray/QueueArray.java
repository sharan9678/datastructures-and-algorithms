package com.sharan.udemy.queueUsingArray;

public class QueueArray {
    public int[] arr;
    public int topOfQueue;
    public int beginningOfQueue;

    public QueueArray(int size) {
        arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with the size of: " + size);
    }

    // isFull method
    public boolean isFull() {
        return topOfQueue == (arr.length - 1);
    }

    // isEmpty method
    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    // enqueue method
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            arr[++topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        } else {
            arr[++topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        }
    }

    // dequeue method
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // delete the whole queue
    public void deleteQueue() {
        arr = null;
        System.out.println("The queue is successfully deleted!");
    }
}
