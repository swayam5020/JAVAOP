import java.util.Scanner;

class Adder {
    int[] a; // Integer array to hold hours and minutes

    // Constructor to initialize the array elements to 0
    public Adder() {
        a = new int[2]; // Initialize array with two elements (hours and minutes)
        a[0] = 0; // Initialize hours to 0
        a[1] = 0; // Initialize minutes to 0
    }
    // Method to read time from the user
    void readtime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        a[0] = scanner.nextInt();
        System.out.print("Enter minutes: ");
        a[1] = scanner.nextInt();
    }
    // Method to add two times and store the result in the current object
    void addtime(Adder X, Adder Y) {
        // Add hours and minutes separately
        a[0] = X.a[0] + Y.a[0];
        a[1] = X.a[1] + Y.a[1];
        // Check if minutes exceed 60 and adjust hours accordingly
        if (a[1] >= 60) {
            a[0] += a[1] / 60;
            a[1] %= 60;
        }
    }
    // Method to display the time
    void disptime() {
        System.out.println("Sum of times: " + a[0] + " hours " + a[1] + " minutes");
    }
    public static void main(String[] args) {
        // Create two Adder objects
        Adder time1 = new Adder();
        Adder time2 = new Adder();

        System.out.println("Enter details for Time A:");
        time1.readtime();

        System.out.println("Enter details for Time B:");
        time2.readtime();

        // Create a third Adder object to store the sum
        Adder sumTime = new Adder();

        // Add Time A and Time B and store the result in sumTime
        sumTime.addtime(time1, time2);

        // Display the sum of times
        sumTime.disptime();
    }
}
