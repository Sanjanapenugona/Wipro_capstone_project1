package Assessement_day9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Buffer_reader {

	public static void main(String[] args) {
		 StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	            System.out.println(content.toString());
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	}

}
