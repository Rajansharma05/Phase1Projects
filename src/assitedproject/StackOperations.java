package assitedproject;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Insert elements into the stack
        stack.push(5);
        stack.push(3);
        stack.push(9);
        stack.push(2);

        System.out.println("Stack elements: " + stack);

        // Remove the top element from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack elements after removal: " + stack);

        // Get the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}
