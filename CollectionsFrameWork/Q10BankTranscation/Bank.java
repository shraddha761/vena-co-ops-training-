package CollectionsFrameWork.Q10BankTranscation;

import java.util.*;

public class Bank {
    private Map<String, List<Transaction>> transactionsLog = new HashMap<>();

    public void addTransaction(String accountNumber, Transaction transaction) {
        transactionsLog.computeIfAbsent(accountNumber, k -> new ArrayList<>()).add(transaction);
    }

    public void generateTransactions(String accountNumber) {
        List<Transaction> transactions = transactionsLog.get(accountNumber);

        if(transactions == null || transactions.isEmpty()) {
            System.out.println("No transactions found for account: " + accountNumber);
            return;
        }

        transactions.sort(Comparator.comparing(Transaction::getTransactionTime));

        System.out.println("Statement for account " + accountNumber + " has been generated");
        for(Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
