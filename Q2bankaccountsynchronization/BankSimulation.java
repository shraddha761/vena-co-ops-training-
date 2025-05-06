package Q2bankaccountsynchronization;

import java.util.Random;

public class BankSimulation {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(12345);

        int userThreads = 10;
        Thread[] threads = new Thread[userThreads];
        Random rand = new Random();

        for (int i = 0; i < userThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    if(rand.nextBoolean()){
                        double amount = rand.nextInt(100) + 1;
                        account.deposit(amount);
                    }
                    else{
                        double amount = rand.nextInt(100) + 1;
                        account.withdraw(amount);
                    }
                }
            }, "User-" + i);
            threads[i].start();
        }
        for(Thread t : threads) t.join();

        System.out.println("Final Balance: " + account.getBalance());
        System.out.println("Transaction Log:");
        for(String log : account.getTranslationLog()){
            System.out.println(log);
        }
    }
}
