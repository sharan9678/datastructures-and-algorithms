package com.sharan.udemy.circularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        System.out.println(circularQueue.deQueue());
    }
}
