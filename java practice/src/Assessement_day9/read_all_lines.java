package Assessement_day9;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class read_all_lines {

	public static void main(String[] args) {
		 Path path = Paths.get("file.txt");

	        try {
	            Files.lines(path).forEach(System.out::println);
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	}

}
