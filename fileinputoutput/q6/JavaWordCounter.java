package fileinputoutput.q6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaWordCounter {
    public static void main(String[] args) {
        String filename = "paragraph.txt";
        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if(word.trim().equalsIgnoreCase("java")){
                        count++;
                    }
                }
            }
            System.out.println("The word 'java' appears " + count + " times in " + filename + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
