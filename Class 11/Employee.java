import java.util.Scanner;

public class Employee {
    private String[] name;
    private int num;

    // Parameterized constructor
    public Employee(int z) {
        num = z;
        name = new String[num];
    }

    // Function to accept the names of employees
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names of employees:");

        for (int i = 0; i < num; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            name[i] = scanner.nextLine();
        }
    }

    // Recursive Bubble Sort function to arrange names in alphabetical order
    private void bubbleSort(int start, int end) {
        if (start == end) {
            return;
        }

        for (int i = 0; i < end; i++) {
            if (name[i].compareTo(name[i + 1]) > 0) {
                // Swap names
                String temp = name[i];
                name[i] = name[i + 1];
                name[i + 1] = temp;
            }
        }

        // Recursive call for the next pass
        bubbleSort(start, end - 1);
    }

    // Function to display the names of employees
    public void display() {
        System.out.println("Sorted names of employees:");

        for (String employeeName : name) {
            System.out.println(employeeName);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        // Create an object of the Employee class
        Employee employeeList = new Employee(numberOfEmployees);

        // Accept names of employees
        employeeList.accept();

        // Sort and display names using Recursive Bubble Sort
        employeeList.bubbleSort(0, numberOfEmployees - 1);
        employeeList.display();

        scanner.close();
    }
}
