package com.sharan.udemy.linkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
//        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(67, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 2);
        sLL.traverseSinglyLinkedList();
//        sLL.searchNode(8);
        sLL.deletionOfNode(3);
        sLL.traverseSinglyLinkedList();
//        System.out.println(sLL.head.value);
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();
    }
}
