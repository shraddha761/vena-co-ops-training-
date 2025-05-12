package fileinputoutput.q5;

import java.io.*;

public class Q5FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "backup.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
