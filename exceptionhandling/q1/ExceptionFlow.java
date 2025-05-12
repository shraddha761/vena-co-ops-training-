package exceptionhandling.q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionFlow {
    static void readData() throws IOException {
         BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
         String line = reader.readLine();
         System.out.println("Line read: " + line);
         reader.close();
    }

    static void processData() throws DataProcessingException {
        try{
            readData();
        }
        catch (IOException e){
            throw new DataProcessingException("File read error", e);
        }
    }

    public static void main(String[] args) {
        try{
            processData();
        }
        catch (DataProcessingException e){
            e.printStackTrace();
        }
    }
}
