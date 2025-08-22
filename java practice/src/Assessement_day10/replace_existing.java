package Assessement_day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class replace_existing {

	public static void main(String[] args) {
		 Path source = Paths.get("hello.txt");
	        Path destination = Paths.get("destination.txt");

	        try {
	            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            System.out.println("Error copying file: " + e.getMessage());
	        }

	}

}
