package Assessement_day8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
	}

}
