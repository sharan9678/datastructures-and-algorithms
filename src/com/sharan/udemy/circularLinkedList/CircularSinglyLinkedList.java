package com.sharan.udemy.circularLinkedList;

public class CircularSinglyLinkedList {
    public Node head = null;
    public Node tail = null;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        // reference to itself, circular singly linked list
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert a value to circular singly linked list
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // traverse in circular singly linked list
    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        } else {
            System.out.println("\nCSLL does not exist!");
        }
    }

    // search method
    public boolean searchNode(int target) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == target) {
                    System.out.println("found " + target + " at index: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("the target does not exist in the linked list!");
        return false;
    }

    // delete method
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("the CSLL does not exist!");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // delete CSLL
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("the circular singly linked does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("csll has been deleted!");
        }
    }
}
