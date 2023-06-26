package assitedproject;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of L (0 <= L <= n-1): ");
        int L = scanner.nextInt();

        System.out.print("Enter the value of R (L <= R <= n-1): ");
        int R = scanner.nextInt();

        int sum = findSumInRange(array, L, R);

        System.out.println("The sum of elements in the range [" + L + ", " + R + "] is: " + sum);
    }

    public static int findSumInRange(int[] array, int L, int R) {
        int sum = 0;

        for (int i = L; i <= R; i++) {
            sum += array[i];
        }

        return sum;
    }
}
