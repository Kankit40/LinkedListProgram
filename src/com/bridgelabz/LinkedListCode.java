package com.bridgelabz;

import org.w3c.dom.Node;
public class LinkedListCode {
    Node head;
    class Node {
        String data; // initialising data in first location
        Node next;   // initialising next in node class

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //Adding the data in first position
    public void addFirst(String data){
        Node newNode = new Node(data); // Making object of node class
        if(head == null){              // Checking if linked list is empty
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedListCode obj = new LinkedListCode();

        obj.addFirst("70");
        obj.addFirst("30");
        obj.addFirst("56");
    }
}
