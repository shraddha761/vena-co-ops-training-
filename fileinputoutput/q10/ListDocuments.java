package fileinputoutput.q10;

import java.io.File;

public class ListDocuments {
    public static void main(String[] args) {
        File folder = new File("documents");

        String[] contents = folder.list();
        if(contents != null) {
            System.out.println("Files and directories in 'documents': ");
            for(String name : contents) {
                System.out.println(name);
            }
        } else{
            System.out.println("The 'documents' folder is empty");
        }
    }
}
