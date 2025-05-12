package fileinputoutput.q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4LineCounter {
    public static void main(String[] args) {
        String fileName = "data.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines in " + fileName + ": " + lineCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
