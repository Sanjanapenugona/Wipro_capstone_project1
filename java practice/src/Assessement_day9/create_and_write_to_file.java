package Assessement_day9;

import java.io.*;
import java.io.IOException;

public class create_and_write_to_file {

	public static void main(String[] args) {
		try (FileWriter w =new FileWriter("C:\\Users\\Sanjana\\Downloads\\Selenium\\cucumber-cucumber-jvm-6ba5316\\student.txt")) {
			w.write("Sanjana\n");
			w.write("Dhana\n");
			w.write("Sri\n");
			w.write("Penugonda\n");
			System.out.println();
			
		}
		catch(IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
			
		}
	

	}

}
