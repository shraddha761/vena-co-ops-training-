package HandsOnDay1_BankSystem;

public abstract class BankAccount {  // Abstraction
    protected String accountNumber; // Encapsulation
    protected double balance; // Encapsulation

    public static final String BANK_NAME = "MyBank";  // static constant

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void display() {
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void applyInterest() {
    }
}
