package assitedproject;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node current = head;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key not found in the list");
            return;
        }

        prev.next = current.next;
    }

    void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DelecteFirstOccurrence {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the list
        list.insert(5);
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(2);

        System.out.print("Before deletion: ");
        list.display();

        int key = 8;
        list.delete(key);

        System.out.print("After deleting first occurrence of " + key + ": ");
        list.display();
    }
}
