package com.sharan.udemy.queueUsingArray;

public class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(3);
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
//        newQueue.enqueue(4);
//        newQueue.enqueue(5);
//        System.out.println(newQueue.isFull());
//        System.out.println(newQueue.isEmpty());
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.peek());
    }
}
