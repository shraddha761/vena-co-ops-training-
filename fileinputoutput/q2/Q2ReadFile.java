package fileinputoutput.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2ReadFile {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
