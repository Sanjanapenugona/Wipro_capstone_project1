package File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class path {

	public static void main(String[] args)  throws IOException {
		Path path=Paths.get("sample12.txt");
		Files.createFile(path);
		System.out.println("File created");
		Path copypath=Paths.get("Samplecopy.txt");
		Files.copy(path,copypath);
		System.out.println("File copied");

	}

}
