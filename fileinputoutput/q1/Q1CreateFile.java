package fileinputoutput.q1;

import java.io.FileWriter;
import java.io.IOException;

public class Q1CreateFile {
    public static void main(String[] args) {
        String fileName = "notes.txt";
        String content = "this is my first file in Java";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}