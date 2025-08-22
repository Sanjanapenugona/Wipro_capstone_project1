package File;
import java.io.*;
import java.util.*;

public class Doc__file_create {

	public static void main(String[] args) {
		  try (FileWriter writer = new FileWriter("document.doc")) {
	            writer.write("This is a sample document file.");
	            System.out.println("Document file created successfully.");
	        } catch (IOException e) {
	            System.out.println("Error creating document file: " + e.getMessage());
	        }

	}

}
