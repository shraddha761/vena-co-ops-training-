package fileinputoutput.q12;

import java.io.*;

public class MergeTextFiles {
    public static void main(String[] args) throws IOException {
        File folder = new File("documents");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        PrintWriter writer = new PrintWriter("merged.txt");

            if (files != null && files.length > 0) {
                for (File file : files) {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.println(line);
                    }
                    reader.close();
                }
                writer.close();
                System.out.println("All .txt files have been merged");
            } else {
                System.out.println("No files found");
            }
        }
    }