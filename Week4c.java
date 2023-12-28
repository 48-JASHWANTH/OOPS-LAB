import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Week4c{
    // Method that may throw IOException
     static void readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Method that may throw NumberFormatException
    static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw e; // Exception propagation
        }
    }

    public static void main(String[] args) {
        try {
            // Demonstrate try-with-resources
            readFromFile("example.txt");

            // Demonstrate multi-catch exceptions
            String invalidNumber = "abc";
            int result = convertToInt(invalidNumber);

            // This line will not be reached if a NumberFormatException is thrown
            System.out.println("Converted number: " + result);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}

