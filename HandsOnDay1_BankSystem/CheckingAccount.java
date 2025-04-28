package HandsOnDay1_BankSystem;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    private double overdraftFee;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit, double overdraftFee) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if ((balance + overdraftLimit) >= amount) {
            boolean wasOverdraftBefore = balance < 0;
            balance -= amount;

            if (!wasOverdraftBefore && balance < 0) {
                balance -= overdraftFee;
                System.out.println(String.format("Overdraft fee of %.2f applied.", overdraftFee));
            }

            System.out.println(String.format("Withdrawn %.2f from CheckingAccount. Remaining balance: %.2f", amount, balance));
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("Overdraft Limit: %.2f", overdraftLimit));
        System.out.println(String.format("Overdraft Fee: %.2f", overdraftFee));
    }
}
