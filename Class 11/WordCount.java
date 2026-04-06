import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        // Open the file and create a Scanner object to read its contents
        File file = new File(fileName);
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(file);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        int wordCount = 0;
        while (fileScanner.hasNext()) { // Iterate over the words in the file
            fileScanner.next(); // read the next word
            wordCount++; // increment the word count
        }

        fileScanner.close(); // Close the scanner to release resources

        System.out.println("Total words in file: " + wordCount);
    }
}
