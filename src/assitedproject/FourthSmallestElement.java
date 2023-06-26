package assitedproject;

import java.util.Arrays;
import java.util.Scanner;

public class FourthSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int size = scanner.nextInt();

        int[] list = new int[size];

        System.out.println("Enter the elements of the list:");

        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        int fourthSmallest = findFourthSmallestElement(list);

        System.out.println("The fourth smallest element in the list is: " + fourthSmallest);
    }

    public static int findFourthSmallestElement(int[] list) {
        if (list.length < 4) {
            throw new IllegalArgumentException("List should have at least four elements");
        }

        Arrays.sort(list);

        return list[3];
    }
}
