package CollectionsFrameWork.Q10BankTranscation;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Transcation t1 = new Transcation("T001", 500.0, LocalDateTime.of(2023, 4, 28, 14, 30, 0));
        Transcation t2 = new Transcation("T002", -200.0, LocalDateTime.of(2023, 4, 28, 16, 45, 0));
        Transcation t3 = new Transcation("T003", 300.0, LocalDateTime.of(2023, 4, 29, 10, 0, 0));
        Transcation t4 = new Transcation("T004", -50.0, LocalDateTime.of(2023, 4, 29, 12, 15, 0));

        bank.addTranscation("A232", t1);
        bank.addTranscation("A123", t2);
        bank.addTranscation("A123", t3);
        bank.addTranscation("A343", t4);

        bank.generateTranscations("A123");
    }
}
