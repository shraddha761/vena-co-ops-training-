package Q2bankaccountsynchronization;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private final int accountNumber;
    private final Object lock = new Object(); // Per-account lock
    private final List<String> transactionLog = new ArrayList<>();

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if(amount <= 0) return;
        synchronized (lock){
            balance += amount;
            log("Deposit " + amount + "Balance " + balance);
        }
    }

    public void withdraw(double amount){
        if(amount <= 0) return;
        synchronized (lock){
            if(balance >= amount) {
                balance -= amount;
                log("Withdraw " + amount + "Balance " + balance);
            }
            else {
                log("Failed withdraw " + amount + "(Insufficient Balance)");
            }
        }
    }
    public double getBalance() {
        synchronized (lock){
            return balance;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    private void log(String message) {
        String logEntry = "[" + Thread.currentThread().getName() + "] " + message;
        transactionLog.add(logEntry);
    }

    public List<String> getTransactionLog() {
        synchronized (lock){
            return new ArrayList<>(transactionLog);
        }
    }
}
