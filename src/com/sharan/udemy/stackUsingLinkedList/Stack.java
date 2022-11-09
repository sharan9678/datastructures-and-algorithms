package com.sharan.udemy.stackUsingLinkedList;

import com.sharan.udemy.linkedList.SinglyLinkedList;

public class Stack {
    public SinglyLinkedList linkedList;

    public Stack() {
        linkedList = new SinglyLinkedList();
    }

    // push
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Push " + value + " successful!");
    }

    // isEmpty method
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // pop method
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The stack is empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // delete
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The stack is deleted!");
    }
}
