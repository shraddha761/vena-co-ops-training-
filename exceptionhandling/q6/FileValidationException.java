package exceptionhandling.q6;

class FileValidationException extends Exception { // caller is expected to handle or recover from the error
    public FileValidationException(String message) {
        super(message);
    }
}
