package exceptionhandling.q2;

// Subclass for invalid account
class InvalidAccountException extends BankingException {
    public InvalidAccountException(String message) {
        super(message);
    }
}
