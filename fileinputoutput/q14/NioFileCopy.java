package fileinputoutput.q14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileCopy {
    public static void main(String[] args) {
        Path source = Paths.get("source.txt");
        Path destination = Paths.get("destination.txt");

        try {
            if (!Files.exists(source)) {
                System.err.println("Source file does not exist.");
                return;
            }
            byte[] data = Files.readAllBytes(source);
            Files.write(destination, data);
            System.out.println("File copied successfully into " + destination);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}