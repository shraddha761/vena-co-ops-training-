package HandsOnDay1_BankSystem;

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000, 0.05);
        CurrentAccount current = new CurrentAccount("CA456", 500, 200, 35);

        System.out.println("=== Savings Account ===");
        savings.display();
        savings.deposit(200);
        savings.withdraw(150); //Polymorphism when we call the overridden method
        savings.applyInterest();
        savings.display();

        System.out.println("\n=== Current Account ===");
        current.display();
        current.deposit(300);
        current.withdraw(900);
        current.withdraw(200);
        current.applyInterest();
        current.display();
    }
}
