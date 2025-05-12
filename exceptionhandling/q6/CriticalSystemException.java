package exceptionhandling.q6;

class CriticalSystemException extends RuntimeException { // Error is unrecoverable
    public CriticalSystemException(String message) {
        super(message);
    }
}
