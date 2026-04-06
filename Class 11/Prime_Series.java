import java.util.Scanner;

public class Prime_Series {
    private int limit;
    private int[] arr;

    // Constructor to initialize limit and arr
    public Prime_Series() {
        limit = 0;
        arr = new int[150];
    }

    // Method to read the limit and input integers in the array
    public void readList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        limit = scanner.nextInt();

        System.out.println("Enter " + limit + " integers:");
        for (int i = 0; i < limit; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // Recursive method to check if a number is prime
    private int isPrime(int num, int j, int f) {
        if (j == 1) {
            return 1; // Prime
        } else {
            if (num % j == 0) {
                f = 0; // Not Prime
            }
            return isPrime(num, j - 1, f);
        }
    }

    // Method to print prime numbers from the array
    public void printPrime() {
        System.out.println("Prime numbers in the list:");

        for (int i = 0; i < limit; i++) {
            int num = arr[i];
            int flag = 1; // Assume the number is prime initially

            if (num > 1) {
                flag = isPrime(num, num / 2, 1); // Check if num is prime
            } else {
                flag = 0; // Not prime for num <= 1
            }

            if (flag == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Prime_Series primeSeries = new Prime_Series();
        primeSeries.readList();
        primeSeries.printPrime();
    }
}
