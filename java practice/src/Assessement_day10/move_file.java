package Assessement_day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class move_file {

	public static void main(String[] args) {
		Path filePath = Paths.get("file1.txt");
        Path newFilePath = Paths.get("newFile.txt");
        Path movedFilePath = Paths.get("movedFile.txt");

        try {
          
            Files.createFile(filePath);
            System.out.println("File created: " + filePath);

   
            Files.write(filePath, "Hello, World!".getBytes());

     
            Files.move(filePath, movedFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to: " + movedFilePath);


            Files.copy(movedFilePath, newFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to: " + newFilePath);

   
            Files.delete(newFilePath);
            System.out.println("File deleted: " + newFilePath);
            Files.delete(movedFilePath);
            System.out.println("File deleted: " + movedFilePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
