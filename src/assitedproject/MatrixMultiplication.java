package assitedproject;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows of the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter the number of rows of the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int columns2 = scanner.nextInt();

        if (columns1 != rows2) {
            System.out.println("Error: The number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];

        System.out.println("Enter the elements of the first matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Resultant matrix after multiplication:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }
}
