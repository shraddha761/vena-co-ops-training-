package exceptionhandling.q6;

public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        // Checked exception example: caller must handle it
        try {
            processor.validateFile("document.pdf");
        } catch (FileValidationException ex) {
            System.out.println(ex.getMessage());
        }

        // Runtime exception: no need to catch, but app may crash
        try {
            processor.loadCriticalConfig(); // Simulates failure
        } catch (CriticalSystemException ex) {
            System.err.println("Unrecoverable error: " + ex.getMessage());
        }
    }
}