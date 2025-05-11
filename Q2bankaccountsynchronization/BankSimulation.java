package Q2bankaccountsynchronization;

import java.util.concurrent.ThreadLocalRandom;

public class BankSimulation {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(12345);

        int userThreads = 10;
        Thread[] threads = new Thread[userThreads];

        for (int i = 0; i < userThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    double amount = ThreadLocalRandom.current().nextInt(100) + 1;
                    if(ThreadLocalRandom.current().nextBoolean()){
                        account.deposit(amount);
                    }
                    else{
                        account.withdraw(amount);
                    }
                }
            }, "User-" + i);
            threads[i].start();
        }
        for(Thread t : threads) t.join();

        System.out.println("Final Balance: " + account.getBalance());
        System.out.println("Transaction Log:");
        for(String log : account.getTransactionLog()){
            System.out.println(log);
        }
    }
}
