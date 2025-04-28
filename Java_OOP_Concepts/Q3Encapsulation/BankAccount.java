package Java_OOP_Concepts.Q3Encapsulation;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolder, double initialBalance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        setBalance(initialBalance);
    }

    void setAccountNumber(String accountNumber) {
        if(accountNumber == null || accountNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid account number");
        }
        this.accountNumber = accountNumber;
    }

    String getAccountNumber() {
        return this.accountNumber;
    }

    void setAccountHolder(String accountHolder) {
        if(accountHolder.isEmpty() || accountHolder.trim().isEmpty()){
            throw new IllegalArgumentException("Account holder name cannot be empty");
        }
        this.accountHolder = accountHolder;
    }

    String getAccountHolder() {
        return this.accountHolder;
    }

    void setBalance(double balance) {
        if(balance < 0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    double getBalance() {
        return this.balance;
    }
}
