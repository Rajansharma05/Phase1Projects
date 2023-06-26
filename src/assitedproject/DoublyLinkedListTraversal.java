package assitedproject;

class DoublyLinkedList {
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
            newNode.previous = current;
        }
    }

    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("Forward traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Backward traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }
}

public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert elements into the doubly linked list
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);

        list.displayForward();
        list.displayBackward();
    }
}
