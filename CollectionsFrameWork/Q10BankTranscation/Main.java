package CollectionsFrameWork.Q10BankTranscation;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Transaction t1 = new Transaction("T001", 500.0, LocalDateTime.of(2023, 4, 28, 14, 30, 0));
        Transaction t2 = new Transaction("T002", -200.0, LocalDateTime.of(2023, 4, 28, 16, 45, 0));
        Transaction t3 = new Transaction("T003", 300.0, LocalDateTime.of(2023, 4, 29, 10, 0, 0));
        Transaction t4 = new Transaction("T004", -50.0, LocalDateTime.of(2023, 4, 29, 12, 15, 0));

        bank.addTransaction("A232", t1);
        bank.addTransaction("A123", t2);
        bank.addTransaction("A123", t3);
        bank.addTransaction("A343", t4);

        bank.generateTransactions("A123");
    }
}
