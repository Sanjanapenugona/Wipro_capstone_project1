package File;
import java.io.File;
import java.io.IOException;

public class create_file {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sanjana\\Downloads\\Selenium\\cucumber-cucumber-jvm-6ba5316\\simple.txt");
		if(f.exists())
			f.delete();
		//System.out.println(f.exists());
		System.out.println(f.createNewFile());
		

	}

}
