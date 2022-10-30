package com.sharan.udemy.circularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(10);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(5, 1);
        csll.insertCSLL(6, 8);
        csll.traverseCSLL();
    }
}
