import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("--- Matrix A ---");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Matrix Addition (A + B) ---");
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Diagonal Elements & Trace ---");
        int traceSum = 0;
        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrixA[i][i] + " ");
            traceSum += matrixA[i][i];
        }
        System.out.println("\nSum of Diagonal (Trace): " + traceSum);

        System.out.println("\n--- Matrix Transpose (A^T) ---");
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrixA[i][j];
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Custom 2D Array Input ---");
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] custom = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                custom[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Matrix:");
        for (int[] row : custom) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
