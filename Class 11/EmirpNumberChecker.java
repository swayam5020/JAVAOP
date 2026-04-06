import java.util.Scanner;

public class EmirpNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isEmirp(number)) {
            System.out.println(number + " is an Emirp number.");
        } else {
            System.out.println(number + " is not an Emirp number.");
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to reverse the digits of a number
    static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is an emirp number
    static boolean isEmirp(int num) {
        if (isPrime(num)) {
            int reversed = reverseNumber(num);
            return num != reversed && isPrime(reversed);
        }
        return false;
    }
}
