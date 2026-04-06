import java.util.*;
class FantasticNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();
        System.out.println("Number entered: " + num);
        if (isThreeDigitFascinating(num)) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is not a fascinating number.");
        }
        sc.close();
    }
    public static boolean isThreeDigitFascinating(int num) {
        if (num < 100 || num > 999) {
            return false; // Check if the number is not three digits
        }
        String concatenated = num + "" + (num * 2) + "" + (num * 3);
        String digits = "123456789";
        // Check if the concatenated string contains all digits from 1 to 9 exactly once
        for (char digit : digits.toCharArray()) {
            if (concatenated.indexOf(digit) == -1 || concatenated.lastIndexOf(digit) != concatenated.indexOf(digit)) {
                return false;
            }
        }
        return true;
    }
}
