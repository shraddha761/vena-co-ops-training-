package HandsOnDay1_BankSystem;

public class SavingsAccount extends BankAccount { // Inheritance
    private double interestRate;
    String accountNumber;
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate){
        super(accountNumber, initialBalance);
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + " accountNumber " +"Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: " + interest + ". New balance: " + balance);
    }

    public void display() {
        super.display();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}