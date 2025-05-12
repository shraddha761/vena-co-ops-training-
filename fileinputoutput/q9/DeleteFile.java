package fileinputoutput.q9;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "oldFile.txt";
        File file = new File(fileName);

        if (file.exists()) {
            if(file.delete()) {
                System.out.println(fileName + " was successfully deleted.");
            }else{
                System.out.println("Failed to delete file " + fileName);
            }
        }
        else {
            System.out.println("File does not exist.");
        }
    }
}