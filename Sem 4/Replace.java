/*Write a Java program to replace all the ‘d’ characters with ‘f’ characters from the given string */
import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();
        original=original.toLowerCase();
        String modified = original.replace('d', 'f');
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
        input.close();
    }
}
