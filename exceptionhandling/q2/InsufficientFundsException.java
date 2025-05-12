package exceptionhandling.q2;

// Subclass for insufficient funds
class InsufficientFundsException extends BankingException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}