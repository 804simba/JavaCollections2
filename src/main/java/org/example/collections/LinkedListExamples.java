package org.example.collections;

public class LinkedListExamples {

    Node head; // head of the list

    // Linked list Node.
    // The inner class is made static
    // so that main() can access it.
    static class Node {
        Node next;
        String data;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to add a new Node with given data
    public void add(LinkedListExamples list, String data) {
        Node new_node = new Node(data);
        Node nextNode;

        if (head == null) {
            head = dataNode;
        } else {
            // check how to create a linkedlist and add to it.
        }
    }
}
