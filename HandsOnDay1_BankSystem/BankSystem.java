package HandsOnDay1_BankSystem;

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000, 0.05);
        CheckingAccount checking = new CheckingAccount("CA456", 500, 200, 35);

        System.out.println("=== Savings Account ===");
        savings.display();
        savings.deposit(200);
        savings.withdraw(150); //Polymorphism when we call the overridden method
        savings.applyInterest();
        savings.display();

        System.out.println("\n=== Checking Account ===");
        checking.display();
        checking.deposit(300);
        checking.withdraw(900);
        checking.withdraw(200);
        checking.applyInterest();
        checking.display();
    }
}
