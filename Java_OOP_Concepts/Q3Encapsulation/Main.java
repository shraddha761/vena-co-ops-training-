package Java_OOP_Concepts.Q3Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Shraddha", 1000,"ACC12345" );
        bankAccount.setBalance(500);

        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
    }
}
