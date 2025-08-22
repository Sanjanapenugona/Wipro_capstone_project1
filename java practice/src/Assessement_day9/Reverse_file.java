package Assessement_day9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_file {

	public static void main(String[] args) {
		 List<String> lines = new ArrayList<>();

	        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                lines.add(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	            return;
	        }

	        Collections.reverse(lines);

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("reversed.txt"))) {
	            for (String line : lines) {
	                writer.write(line);
	                writer.newLine();
	            }
	            System.out.println("File content reversed successfully");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }

	}

}
