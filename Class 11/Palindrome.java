import java.util.Scanner;
public class Palindrome {
    // Define a recursive function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // If the length of the string is 0 or 1, it's always a palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else {
            // Check if the first and last characters of the string are equal
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                // Remove the first and last characters and recursively call the function
                return isPalindrome(str.substring(1, str.length() - 1));
            } else {
                // If the first and last characters are not equal, it's not a palindrome
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // Take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        // Check if the string is a palindrome and print the result
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
