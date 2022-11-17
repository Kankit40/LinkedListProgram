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

    // Adding the data to the last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode= tempNode.next;
        }
        tempNode.next = newNode;
    }
    //Printing the code
    void Print() {
        if (head == null) {                                  // Checking f head is empty or not
            System.out.println("Linked list is empty...");
            return;
        }
        Node tempNode = head;                                 // Taking temp node
        while (tempNode != null) {                          // Running the temp node throughout the linked list
            System.out.print(tempNode.data + "-");         // Printing temp node data
            tempNode = tempNode.next;                       // Storing next node in temp data
        }
    }
    
    public static void main(String[] args) {
        LinkedListCode obj = new LinkedListCode();

        obj.addFirst("56");
        obj.addFirst("30");
        obj.addFirst("70");

        obj.Print();
    }
}
