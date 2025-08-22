package Assessement_day10;
import java.io.File;

public class file_exist {

	public static void main(String[] args) {
		String filePath="test.txt" ;
		File file=new File(filePath);
		if (file.exists())
		{
			System.out.println("file exists in the path");
		}
		else
		{
			System.out.println("file doesn't exist in the path");
		}
		

	}

}
