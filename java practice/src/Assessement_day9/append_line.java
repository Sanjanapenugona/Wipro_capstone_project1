package Assessement_day9;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class append_line {

	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt", true))) {
            writer.write("This is a new line of text.");
            writer.newLine();
            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
	}

}
