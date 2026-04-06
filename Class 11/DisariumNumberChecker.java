import java.util.Scanner;

public class DisariumNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }

    // Function to check if a number is a Disarium number
    static boolean isDisarium(int num) {
        int temp = num;
        int numDigits = countDigits(num);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
            numDigits--;
        }

        return sum == num;
    }

    // Function to count the number of digits in a number
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
