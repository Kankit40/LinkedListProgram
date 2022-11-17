package com.bridgelabz;

import org.w3c.dom.Node;

import javax.xml.crypto.Data;

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

    // Counting the size
    public int size() {
        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;

    }
        // inserting the data in between
    public void insertIndex(int userIndex, String data) {
        LinkedListCode obj1 = new LinkedListCode();

        // User trying to insert a first position
        if (userIndex == 0)
            obj1.addFirst(data);

            // User trying to insert a last position
        else if (userIndex == size())
            obj1.addLast(data);

            // User trying to insert a invalid position
        else if (userIndex < 0 || userIndex >= size())
            System.out.println("Invalid index");

            // User trying to insert a specific index
        else {
            // Creating New Node
            Node newNode = new Node(data);

            // To track traversing
            int index = 0;

            // Pointers to track left & right side elements
            Node left = head;
            Node right = left.next;

            // Traverse or Move till last element before user entered index
            while (index < userIndex - 1) {
                left = left.next;
                right = right.next;
                index++;
            }
            // Connecting new Node with right side elements
            newNode.next = right;

            // Connecting left side elements with new Node
            left.next = newNode;
        }
    }

    // Deleting the first element
    public void deleteFirst(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        LinkedListCode obj = new LinkedListCode();

        obj.addFirst("56");
        obj.addFirst("30");
        obj.addFirst("70");
        obj.insertIndex(2, "Your");
        obj.deleteFirst();
        obj.Print();
    }
}
