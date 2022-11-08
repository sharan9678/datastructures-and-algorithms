package com.sharan.udemy.linkedListInterview;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(4);
        ll.insertNode(5);

//        ll.traversalLL();
//        removeDuplicate(ll);
//        ll.traversalLL();
//
//        System.out.println(nThToLast(ll, 3).value);
        ll.traversalLL();
        partition(ll, 3).traversalLL();
        ll.traversalLL();

        sumList(ll, ll).traversalLL();
    }

    // remove all the duplicate value from the linkedList
    public static void removeDuplicate(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int currVal = current.value;
            if (hs.contains(currVal)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(currVal);
                prev = current;
            }
            current = current.next;
        }
    }

    // return the Nth value from the last in the linkedList
    public static Node nThToLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) {
                return null;
            } else {
                p2 = p2.next;
            }
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    // partition
    public static LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    // Question 4: Sum List
    public static LinkedList sumList(LinkedList llA, LinkedList llB) {
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result % 10);
            carry = result / 10;
        }
        if (carry != 0) {
            resultLL.insertNode(carry);
        }
        return resultLL;
    }

    // Question 5 - Intersection
    // get Kth Node
    public static Node getKthNode(Node head, int k) {
        Node current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    // intersection method
    public static Node findIntersection(LinkedList list1, LinkedList list2) {
        if (list1.head == null || list2.head == null) return null;
        if (list1.tail != list2.tail) return null;
        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size) {
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }
        longer = getKthNode(longer, Math.abs(list1.size - list2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    // add same node
    public static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }
}
