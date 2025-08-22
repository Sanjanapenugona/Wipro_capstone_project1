package Assessement_day9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class check_lines {

	public static void main(String[] args) {
		  try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
	            int lineCount = 0;
	            int wordCount = 0;
	            int charCount = 0;
	            String line;

	            while ((line = reader.readLine()) != null) {
	                lineCount++;
	                charCount += line.length() + 1; // +1 for newline character
	                wordCount += line.split("\\s+").length;
	            }

	            System.out.println("Lines: " + lineCount);
	            System.out.println("Words: " + wordCount);
	            System.out.println("Characters: " + charCount);
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	}

}
