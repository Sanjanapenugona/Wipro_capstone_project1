package Assessement_day9;
import java.io.File;
import java.util.Scanner;
public class Delete_file {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the file name: ");
	        String fileName = scanner.nextLine();
	        scanner.close();

	        File file = new File(fileName);
	        if (file.exists() && file.isFile()) {
	            if (file.delete()) {
	                System.out.println("File deleted successfully.");
	            } else {
	                System.out.println("Failed to delete the file.");
	            }
	        } else {
	            System.out.println("File does not exist.");
	        }

	}

}
