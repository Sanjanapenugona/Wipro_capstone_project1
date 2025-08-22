package Assessement_day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class standard_option {

	public static void main(String[] args) {
		String filePath = "date.txt";
        try {
            Files.write(Paths.get(filePath), "Hello".getBytes());
            Files.write(Paths.get(filePath), " to World!".getBytes(), StandardOpenOption.APPEND);
            System.out.println("File content: " + new String(Files.readAllBytes(Paths.get(filePath))));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


	}

}
