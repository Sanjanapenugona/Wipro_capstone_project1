package Assessement_day9;
import java.io.File;
public class file_exist {

	public static void main(String[] args) {
		  String filePath ="test.txt"; // replace with your file path
	        File file = new File(filePath);

	        if (file.exists()) {
	            System.out.println("File exists ");
	        } else {
	            System.out.println("File does not exist");
	        }

	}

}
