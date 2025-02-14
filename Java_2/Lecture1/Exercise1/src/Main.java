import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        long timeStamp = System.currentTimeMillis();
        String filePathstring = "Java_2/Lesson1/uniqueName_" + timeStamp + ".txt";
        File f = new File(filePathstring);
        if (f.exists()) {
            System.out.println("File already exists on given location");
        } else {
            Path filePath = Paths.get(filePathstring);
            try {
                Files.createFile(filePath);
                System.out.println("The file was successfully created");
                File f1 = new File(filePathstring);
                System.out.println("File name: " + f1.getName());
                System.out.println("File relative path(String): " + f1.getPath());
                System.out.println("File absolute path(String): " + f1.getAbsolutePath());
                System.out.println("File read privilege: " + f1.canRead());
                System.out.println("File write privilege: " + f1.canWrite());
                System.out.println("File execute privilege: " + f1.canExecute());
            } catch (IOException e) {
                System.err.println("Error occured while creating file");
            }

        }
    }
}