import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input date of birth in mm dd yyyy format
        System.out.println("Enter your date of birth (mm dd yyyy): ");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        // Check if the date is valid
        if (isValidDate(month, day, year)) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }
    }
    // Function to check if a date is valid
    private static boolean isValidDate(int month, int day, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    // Function to get the number of days in a month
    private static int daysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

