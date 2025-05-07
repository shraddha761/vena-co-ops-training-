package lambdasfunction.dataprocessing.Q1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(110.0, "Debit"),
                new Transaction(200.0, "Credit"),
                new Transaction(50.0, "Debit"),
                new Transaction(75, "Debit")
        );

        double totalDebit = transactions.stream()
                .filter(t -> "Debit". equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println(totalDebit);
    }
}
