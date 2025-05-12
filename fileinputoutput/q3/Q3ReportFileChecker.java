package fileinputoutput.q3;

import java.io.File;

public class Q3ReportFileChecker {
    public static void main(String[] args) {
        File file = new File("report.pdf");

        if(file.exists() && file.isFile()) {
            System.out.println("File size : " + file.length() + " bytes");
        }
        else{
            System.out.println("File report.pdf does not exist");
        }
    }
}
