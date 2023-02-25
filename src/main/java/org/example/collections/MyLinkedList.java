package org.example.collections;

public class MyLinkedList<T> {
    Node<T> head; // head of the list

    // LinkedList Node is made static so that main() can access it.
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    // method to add a new Node
    public static <T> MyLinkedList<T> insert(MyLinkedList<T> list, T data) {
        // Create a new Node with given data
        Node<T> new_node = new Node(data);

        // if the LinkedList is empty,
        // then make the new node as the head.
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else transverse till the last Node
            // and add the new Node there.
            Node<T> last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // if a null pointer is found in the list
            last.next = new_node;
        }
        // return the list by the head.
        return list;
    }

    public static <T> void printList(MyLinkedList<T> list) {
        Node<T> currentNode = list.head;

        System.out.print("My LinkedList: ");
        // transverse through the list
        while(currentNode != null) {
            // print the data at the current node
            System.out.print(currentNode.data + " ");
            // go to next node
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll = insert(mll,12);
        mll = insert(mll,13);
        mll = insert(mll,14);
        mll = insert(mll,17);
        mll = insert(mll,120);
        mll = insert(mll,1);

        // print list
        printList(mll);
    }
}
