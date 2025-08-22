package Assesement_day6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
	 public static void readFile(String filename) throws FileNotFoundException, IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line = reader.readLine();
	            System.out.println("First line of the file: " + line);
	        }
	    }


	public static void main(String[] args) {
		 String filename = "data.txt";

	        try {
	            readFile(filename);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + filename);
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        } finally {
	            System.out.println("Cleanup done.");
	        }
	    }
	}
