package day05.misc;

public class LinkedList1 {
    Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList1 insert(LinkedList1 list, int data) {
        // Create a new node with the given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at the last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public static void printList(LinkedList1 list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at the current node
            System.out.print(currNode.data + " ");

            // Go to the next node
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        // Start with the empty list.
        LinkedList1 list = new LinkedList1();

        // Insert values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}
