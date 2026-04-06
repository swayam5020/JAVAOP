/*Write a program that takes a String from the user on the command-line and print it in reverse. 
This is a test” must be printed as: “test a is This”. */
import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String[] words = str.split(" ");
        System.out.print("Reversed: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + (i == 0 ? "" : " "));
        }
        System.out.println();
        input.close();
    }
}

