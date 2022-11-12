package com.sharan.udemy.queueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        System.out.println(queueLinkedList.isEmpty());
        queueLinkedList.enQueue(1);
        queueLinkedList.enQueue(2);
        queueLinkedList.enQueue(3);
        queueLinkedList.list.traverseSinglyLinkedList();
        System.out.println(queueLinkedList.peek());
        queueLinkedList.deleteQueue();
        System.out.println(queueLinkedList.peek());
    }
}
