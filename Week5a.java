import java.io.*;

public class Week5a{

    public static void main(String[] args) {
        String inputFileName = "example.txt"; // Replace with your file name
        int numberOfParts = 3; // Change to the desired number of parts

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            File inputFile = new File(inputFileName);
            long fileSize = inputFile.length();
            long partSize = fileSize / numberOfParts;

            for (int i = 1; i <= numberOfParts; i++) {
                String outputFileName = inputFileName.replace(".", "_part" + i + ".");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                    for (long bytesRead = 0; bytesRead < partSize; bytesRead += reader.transferTo(writer));
                }
            }

            System.out.println("File splitting completed successfully.");
        } catch (IOException e) {
            System.err.println("Error during file splitting: " + e.getMessage());
        }
    }
}
