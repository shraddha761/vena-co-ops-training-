package CollectionsFrameWork.Q10BankTranscation;

import java.util.*;

public class Bank {
    private Map<String, List<Transcation>> transcationsLog = new HashMap<>();

    public void addTranscation(String accountNumber, Transcation transcation) {
        transcationsLog.computeIfAbsent(accountNumber, k -> new ArrayList<>()).add(transcation);
    }

    public void generateTranscations(String accountNumber) {
        List<Transcation> transcations = transcationsLog.get(accountNumber);

        if(transcations == null || transcations.isEmpty()) {
            System.out.println("No transactions found for account: " + accountNumber);
            return;
        }

        transcations.sort(Comparator.comparing(Transcation::getTransactionTime));

        System.out.println("Statement for account " + accountNumber + " has been generated");
        for(Transcation transcation : transcations) {
            System.out.println(transcation);
        }
    }
}
