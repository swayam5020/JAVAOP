import java.util.Scanner;
public class PrimeAdamNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();
        System.out.println("Prime Adam numbers in the range [" + lowerLimit + ", " + upperLimit + "]:");
        printPrimeAdamNumbersInRange(lowerLimit, upperLimit);
    }
    // Helper method to check if a number is prime.
    private static boolean  isPrime(int num) {
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
    // Helper method to reverse a number.
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    // Helper method to check if a number is an Adam number.
    private static boolean isAdamNumber(int num)//103
    {
        int numSquared = num * num;//10609
        int reversedNumSquared = reverseNumber(numSquared);//90601
        int reversedNum = reverseNumber(num);//301
        int reversedNumSquaredSquared = reversedNum * reversedNum;//301*301=90601
        if( reversedNumSquared == reversedNumSquaredSquared)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    // Helper method to print prime Adam numbers in a given range.
    private static void printPrimeAdamNumbersInRange(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i) && isAdamNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
