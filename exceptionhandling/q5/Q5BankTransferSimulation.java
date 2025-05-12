package exceptionhandling.q5;

public class Q5BankTransferSimulation {
    public static void main(String[] args)  {
        Bank bank = new Bank();
        bank.addAccount(new BankAccount("A001", 1000));
        bank.addAccount(new BankAccount("A002", 2000));

        System.out.println("Initial balance ");
        bank.printBalance();

        bank.transfer("A001", "A002", 200);
        bank.transfer("A001", "A003", 100);  // Fails - target doesn't exist
        bank.transfer("A002", "A001", 1000); // Fails - insufficient funds

        System.out.println("Final balance ");
        bank.printBalance();
    }
}
