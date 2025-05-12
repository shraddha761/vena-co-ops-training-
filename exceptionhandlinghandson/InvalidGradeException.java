package exceptionhandlinghandson;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}