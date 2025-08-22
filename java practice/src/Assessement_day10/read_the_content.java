package Assessement_day10;
import java.io.*;
import java.io.IOException;

public class read_the_content {

	public static void main(String[] args) {
		 try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
	            String line;
	            System.out.println("File content:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	}

}
