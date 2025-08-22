package Assessement_day9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy_content {

	public static void main(String[] args) {
		  try (BufferedReader reader = new BufferedReader(new FileReader("date.txt"));
		             BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"))) {

		            String line;
		            System.out.println("Content of source.txt:");
		            while ((line = reader.readLine()) != null) {
		                System.out.println(line);
		                writer.write(line);
		                writer.newLine();
		            }
		            System.out.println("\nFile copied successfully. Content of destination.txt:");
		            printFileContent("destination.txt");

		        } catch (IOException e) {
		            System.out.println("Error copying file: " + e.getMessage());
		        }
		    }

		    private static void printFileContent(String filename) {
		        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                System.out.println(line);
		            }
		        } catch (IOException e) {
		            System.out.println("Error reading file: " + e.getMessage());
		        }

	}

}
