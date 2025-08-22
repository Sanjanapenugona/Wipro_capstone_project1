package File;
import java.io.*;
import java.util.*;


public class Using_all_files {

	public static void main(String[] args)  throws IOException {
		 File file = new File("sample.txt");

	        // Create file and write content
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
	            writer.write("welcome to training!");
	        }

	        // Write content using PrintWriter
	        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
	            printWriter.println("This is my file.");
	        }
	        

	        // Read content
	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            System.out.println("Content:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
	        // Check if file exists
	        System.out.println("File Exists: " + file.exists());

	        // Check if file is readable
	        System.out.println("File Readable: " + file.canRead());

	        // Check if file is writable
	        System.out.println("File Writable: " + file.canWrite());

	        // Get file size and location
	        System.out.println("File Size: " + file.length() + " bytes");
	        System.out.println("File Location: " + file.getAbsolutePath());
		
	}
		
		
	

}
