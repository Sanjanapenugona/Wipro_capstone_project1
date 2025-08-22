package Assessement_day9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replace_file {

	public static void main(String[] args) {
		 try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));
	             BufferedWriter writer = new BufferedWriter(new FileWriter("updated_story.txt"))) {

	            String line;
	            while ((line = reader.readLine()) != null) {
	                String updatedLine = line.replaceAll("Java", "Python");
	                writer.write(updatedLine);
	                writer.newLine();
	            }
	            System.out.println("Word replaced successfully. Updated content written to updated_story.txt");

	        } catch (IOException e) {
	            System.out.println("Error reading or writing file: " + e.getMessage());
	        }

	}

}
