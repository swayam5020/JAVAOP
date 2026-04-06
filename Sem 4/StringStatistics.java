/* 3.Write a program to accept a string from the user and find out the following statistics:
(a)	Count of uppercase character 
(b)	Count of lowercase character
(c)	Count of digits
(d)	Count of spaces*/
import java.util.Scanner;
public class StringStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int upper = 0, lower = 0, digits = 0, spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }
        System.out.println("\n--- Statistics ---");
        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        input.close();
    }
}