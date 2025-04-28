package Java_OOP_Concepts.Q8BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Shraddha", 10000, "Saving Account");
        account.display();

        System.out.println("Depositing");
        account.Deposit(5000);
        account.display();
    }
}
