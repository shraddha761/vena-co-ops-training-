package fileinputoutput.q13;

import java.io.File;
import java.io.RandomAccessFile;

public class Q13LogMonitor {
    public static void main(String[] args) throws Exception {
        File logFile = new File("server.log");

        long lastKnowPosition = 0;

        while(true){
            long fileLength = logFile.length();
            if(fileLength > lastKnowPosition){
                RandomAccessFile reader = new RandomAccessFile(logFile, "r");
                reader.seek(lastKnowPosition);

                String line;
                while((line = reader.readLine()) != null){
                    if (line.toLowerCase().contains("error")){
                        System.out.println(line);
                    }
                }
                lastKnowPosition = reader.getFilePointer();
                reader.close();
            }
            Thread.sleep(1000);
        }
    }
}
