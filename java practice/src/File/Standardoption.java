package File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Standardoption {

	public static void main(String[] args) {
		 String filePath = "data.txt";
	        try {
	            Files.write(Paths.get(filePath), "Welcome".getBytes());
	            Files.write(Paths.get(filePath), " to Training!".getBytes(), StandardOpenOption.APPEND);
	            System.out.println("File content: " + new String(Files.readAllBytes(Paths.get(filePath))));
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
