package assitedproject;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue
        queue.offer(5);
        queue.offer(3);
        queue.offer(9);
        queue.offer(2);

        System.out.println("Queue elements: " + queue);

        // Remove the element from the front of the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue elements after removal: " + queue);

        // Get the element from the front of the queue without removing it
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }
}
