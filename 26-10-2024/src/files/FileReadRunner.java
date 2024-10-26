package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException{
        //Path currentDirectory = Paths.get(".");
        Path fileToRead = Paths.get("./src/files/data.txt");
        List<String> lines =  Files.readAllLines(fileToRead);
        System.out.println(lines);
    }
}
