package Java_OOP_Concepts.Q8BankAccount;

public class BankAccount {
    private String name;
    private int balance;
    private String type;

    public BankAccount(String name, int balance, String type) {
        this.name = name;
        this.balance = balance;
        this.type = type;
    }
    public void Deposit(int balance){
        this.balance += balance;  // Resolves method shadowing
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Type: " + type);
    }

}
