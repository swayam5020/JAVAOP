import java.util.Scanner;
import java.util.Arrays;
public class DiagonalSortMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (even, >=3, <10): ");
        int N = sc.nextInt();
        if (N % 2 != 0 || N < 3 || N >= 10) {
            System.out.println("Invalid input for N. It must be even, >=3, and <10.");
            sc.close();
            return;
        }
        int[][] matrix = new int[N][N];
        // Input positive integers into the matrix
        System.out.println("Enter positive integers into the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        // Sort and rearrange diagonal elements
        int[] diagonal = new int[N];
        for (int i = 0; i < N; i++) {
            diagonal[i] = matrix[i][i];
        }
        Arrays.sort(diagonal);
        for (int i = 0; i < N; i++) {
            matrix[i][i] = diagonal[i];
        }
        // Display the modified matrix
        System.out.println("Modified Matrix:");
        displayMatrix(matrix);
        sc.close();
    }
    public static void displayMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
