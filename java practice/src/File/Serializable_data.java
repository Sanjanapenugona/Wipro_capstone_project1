package File;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serializable_data {

	public static void main(String[] args) {
		        // Create a Student object
		        Student student = new Student(1, "Sanjana");

		        // Serialize the Student object to a file
		        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
		            oos.writeObject(student);
		            System.out.println("Student object serialized to file.");
		        } catch (IOException e) {
		            System.out.println("Error serializing student object: " + e.getMessage());
		        }

	}

}
