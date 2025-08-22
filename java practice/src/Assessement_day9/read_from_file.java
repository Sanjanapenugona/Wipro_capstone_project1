package Assessement_day9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read_from_file {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Sanjana\\Downloads\\Selenium\\cucumber-cucumber-jvm-6ba5316\\student.txt"))) {
            String line;
            System.out.println("Student Names:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

	}

}
