package Assessement_day10;
import java.io.FileWriter;
import java.io.IOException;


public class writer_hello_world {

		 public static void main(String[] args) {
		        try (FileWriter writer = new FileWriter("hello.txt")) {
		            writer.write("Hello, World!");
		//            System.out.println("Text written to file.");
		        } catch (IOException e) {
		            System.out.println("Error writing to file: " + e.getMessage());
		        }
		        
	}

}
