package CollectionsFrameWork.Q10BankTranscation;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private double amount;
    private LocalDateTime transactionTime;

    public Transaction(String transactionId, double amount, LocalDateTime transactionTime) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionTime = transactionTime;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount + ", Time: " + transactionTime;
    }
}
