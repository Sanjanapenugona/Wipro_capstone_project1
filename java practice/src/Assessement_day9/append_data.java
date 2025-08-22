package Assessement_day9;
import java.io.FileWriter;
import java.io.IOException;

public class append_data {

	public static void main(String[] args) {
		 try (FileWriter writer = new FileWriter("student.txt", true)) {
	            writer.write("Prasanna\n");
	            System.out.println("New student name appended to file.");
	        } catch (IOException e) {
	            System.out.println("Error appending to file: " + e.getMessage());
	        }
	}

}
