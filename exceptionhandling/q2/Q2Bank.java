package exceptionhandling.q2;

public class Q2Bank {
    static void transferFunds(String fromAccount, String toAccount, double amount) throws  BankingException {
        if (fromAccount == null || toAccount == null) {
            throw new InvalidAccountException("Account number is invalid.");
        }

        if(amount > 1000){
            throw new InsufficientFundsException("Insufficient funds from transfer.");
        }
        System.out.println("Transferred " + amount + " from " + fromAccount + " to " + toAccount + ".");
    }

    public static void main(String[] args) {
        try{
            transferFunds(null, "ACC456", 100);
        }
        catch (InsufficientFundsException e){
            System.out.println("Caught InsufficientFundsException: " + e.getMessage());
        }
        catch (InvalidAccountException e) {
            System.out.println("Caught InvalidAccountException: " + e.getMessage());
        }
        catch (BankingException e) {
            System.err.println("Caught general banking error: " + e.getMessage());
        }
        try{
            transferFunds("ACC123", "ACC456", 2000);
        } catch (BankingException e) {
            System.out.println("Caught BankingException: " + e.getMessage());
        }
    }
}
