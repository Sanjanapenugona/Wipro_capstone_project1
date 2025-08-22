package Assessement_day9;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Standard {

	public static void main(String[] args) {
		Path path = Paths.get("file.txt");
        String data = "Hello, World!";

        try {
            // Write data to file
            Files.write(path, data.getBytes());
            System.out.println("Data written to file successfully.");

            // Append data to file
            String appendData = "\nThis is appended data.";
            Files.write(path, appendData.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Data appended to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
	}

}
