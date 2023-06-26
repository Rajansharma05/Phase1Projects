package assitedproject;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int steps = 5;

        System.out.println("Original array: " + Arrays.toString(array));

        rightRotateArray(array, steps);

        System.out.println("Rotated array: " + Arrays.toString(array));
    }

    public static void rightRotateArray(int[] array, int steps) {
        int length = array.length;

        // Normalize the number of steps
        steps = steps % length;

        // Reverse the entire array
        reverseArray(array, 0, length - 1);

        // Reverse the first part of the array
        reverseArray(array, 0, steps - 1);

        // Reverse the remaining part of the array
        reverseArray(array, steps, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

