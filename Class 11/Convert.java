//Design a class Convert to find the date and the month from a given day number for a particular year. Example: If day number is 64 and the year is 2020, then the corresponding date would be: March 4, 2020 i.e. (31 +29+ 4 = 64).
import java.util.*;

class Convert {
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int year;
    private int dayNumber;
    Convert(int year, int dayNumber) {
        this.year = year;
        this.dayNumber = dayNumber;
    }
    void findDateAndMonth() {
        int month = 0;
        int day = dayNumber;
        // Check for a leap year and adjust February's days accordingly
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        // Find the month and day
        for (int i = 0; i < 12; i++) {
            if (day <= daysInMonth[i]) {
                month = i + 1;
                break;
            }
            day -= daysInMonth[i];
        }
        System.out.println("Corresponding date: " + monthName(month) + " " + day + ", " + year);
    }
    // Check if a year is a leap year
    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Get the name of the month for a given month number
    String monthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
            };
        return monthNames[month - 1];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the day number: ");
        int dayNumber = input.nextInt();

        Convert converter = new Convert(year, dayNumber);
        converter.findDateAndMonth();
    }
}
