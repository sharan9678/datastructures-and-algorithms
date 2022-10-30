package com.sharan.udemy.linkedList;

public class SinglyLinkedList {
    // create head and tail, initialize with null
    public Node head;
    public Node tail;
    public int size;

    // create a blank node and assign a value to it and reference to null
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        // link head and tail with this node
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert method in singlyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // traversal of singlyLinkedList
//    public void traverseSinglyLinkedList() {
//        if (head == null) {
//            System.out.println("SLL does not exist");
//        } else {
//            Node tempNode = head;
//            for (int i = 0; i < size; i++) {
//                System.out.print(tempNode.value);
//                if (i != size - 1) {
//                    System.out.print(" -> ");
//                }
//                tempNode = tempNode.next;
//            }
//        }
//        System.out.println("\n");
//    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("LinkedList does not exist!");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.value);
                if (tempNode.next != null) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print ("\n");
    }

    // searching a node in linkedList
    public void searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("LinkedList does not exist!");
        } else {
            Node tempNode = head;
            int index = 0;
            while (tempNode != null) {
                if(tempNode.value == nodeValue) {
                    System.out.println("found " + nodeValue + " at index: " + index);
                    return;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        System.out.println("node does not exist");
    }

    // deleting a node from the linkedList
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("sLL does not exist!");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
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

    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("singlyLinkedList deleted successfully!");
    }
}
