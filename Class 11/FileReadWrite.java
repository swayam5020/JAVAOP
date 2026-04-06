import java.util.*;
import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name to write to: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            System.out.println("Enter the text to write to the file (press enter to exit): ");
            String input;
            while (!(input = scanner.nextLine()).isEmpty()) {
                writer.write(input);
                writer.write("\n");
            }
            writer.close();

            Scanner reader = new Scanner(file);
            System.out.println("\nThe contents of the file are: ");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while accessing the file.");
            e.printStackTrace();
        }
    }
}
