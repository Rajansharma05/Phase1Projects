package assitedproject;

import java.util.Scanner;

class CircularLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;

            // Find the last node in the list
            while (current.next != head) {
                current = current.next;
            }

            // Insert the new node at the end
            current.next = newNode;
            newNode.next = head;

            // Update the head to maintain the circular structure
            if (newNode.data < head.data) {
                head = newNode;
            }
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class InsertInSortedCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Insert elements into the sorted circular linked list
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);

        System.out.print("Before insertion: ");
        list.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element that you want to inserted in circular linkedlist :");
        int newData = sc.nextInt();
        list.insert(newData);

        System.out.print("After inserting " + newData + ": ");
        list.display();
    }
}
