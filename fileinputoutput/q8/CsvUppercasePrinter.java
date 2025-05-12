package fileinputoutput.q8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvUppercasePrinter {
    public static void main(String[] args) {
        String fileName = "employees.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
