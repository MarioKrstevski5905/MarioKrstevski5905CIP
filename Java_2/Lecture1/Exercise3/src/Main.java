import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("Java_2/Lecture1/src");
        String ext = ".java";
        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath, "*" + ext);
            for (Path p : directoryStream){
                System.out.println(p);
            }
        } catch(IOException e){
            System.err.println("There was an unexpected error!");
        }
    }
}