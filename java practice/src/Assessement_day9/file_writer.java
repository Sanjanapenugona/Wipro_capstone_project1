package Assessement_day9;
import java.io.FileWriter;
import java.io.IOException;
public class file_writer {

	public static void main(String[] args) {
		 try (FileWriter writer = new FileWriter("hello.txt")) {
	            writer.write("Hello, World!");
	            System.out.println("Text written to file successfully.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }
	}

}
