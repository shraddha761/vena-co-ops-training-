package exceptionhandling.q6;

public class FileProcessor {

    public void validateFile(String fileName) throws FileValidationException {
        //Checked exception that caller will handle it
        if(fileName == null || !fileName.endsWith(".txt")) {
            throw new FileValidationException("Invalid file: " + fileName);
        }
        System.out.println("File: " + fileName + " is valid");
    }

    public void loadCriticalConfig() throws CriticalSystemException {
        boolean dbConnectionFailed = true;  // simulated condition
        if(dbConnectionFailed){
            throw new CriticalSystemException("Database connection failed");
        }
    }
}