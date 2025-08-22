package Assessement_day9;
import java.io.File;
import java.io.IOException;

public class create_file {

	public static void main(String[] args) {
		 File file = new File("test1.txt");
	        try {
	            if (file.createNewFile()) {
	                System.out.println("File test.txt created successfully.");
	            } else {
	                System.out.println("File test.txt already exists.");
	            }
	        } catch (IOException e) {
	            System.out.println("Error creating file: " + e.getMessage());
	        }
	}

}
