package fileinputoutput.q7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LogAppender {
    public static void main(String[] args) {
        String fileName = "log.txt";
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String line = "Last Updated on " + today.format(formatter);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(line);
            System.out.println("Line appended to file " + fileName);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}