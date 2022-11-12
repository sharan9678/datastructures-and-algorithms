package com.sharan.udemy.queueUsingLinkedList;

import com.sharan.udemy.linkedList.SinglyLinkedList;

public class QueueLinkedList {
    SinglyLinkedList list;

    public QueueLinkedList() {
        this.list = new SinglyLinkedList();
        System.out.println("The Queue is created successfully!");
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue!");
    }

    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            value = list.head.value;
            list.deletionOfNode(1);
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return -1;
        } else {
            return list.head.value;
        }
    }

    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The queue is successfully deleted!");
    }
}
