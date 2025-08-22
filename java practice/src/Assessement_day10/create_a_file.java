package Assessement_day10;
import java.io.FileWriter;
import java.io.IOException;

public class create_a_file {

	public static void main(String[] args) {
		try (FileWriter writer=new FileWriter("test.txt")) {
			System.out.println("created text file");
		} catch (IOException e) {
			System.out.println("error creating filr=" +e);
		}
		

	}

}
