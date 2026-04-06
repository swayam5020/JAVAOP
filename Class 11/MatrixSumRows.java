import java.util.Scanner;

public class MatrixSumRows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input the number of rows (R) and columns (C)
        System.out.print("Enter the number of rows (R): ");
        int R = input.nextInt();
        System.out.print("Enter the number of columns (C): ");
        int C = input.nextInt();
        if (R <= 2 || C <= 2 || R > 10 || C > 10) {
            System.out.println("Please enter valid values for R and C (R > 2, C > 2, R <= 10, C <= 10).");
            return;
        }
        int[][] matrix = new int[R][C+1];
        // Input elements for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                matrix[i][j] = input.nextInt();
            }
        }
        // Calculate the sum of each row's elements and display the original and new matrices
        System.out.println("Original Matrix:");
        for (int i = 0; i < R; i++) {
            int rowSum = 0;
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + "\t");
                rowSum += matrix[i][j];
            }
            matrix[i][C] = rowSum; // Store row sum in an extra column
            System.out.println();
        }
        System.out.println("Matrix with Row Sums:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j <= C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
