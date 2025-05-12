package exceptionhandling.q5;

import java.util.HashMap;
import java.util.Map;

class Bank{
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountId(), account);
    }

    public void transfer(String fromId, String toId, int amount) {
        BankAccount from = accounts.get(fromId);
        BankAccount to = accounts.get(toId);

        if(from == null) {
            System.out.println("Account not found");
            return;
        }

        int originalFromBalance = from.getBalance();
        int originalToBalance = to != null ? to.getBalance() : 0;

        try{
            if(to == null){
                throw new Exception("Target account not found");
            }
            from.debit(amount);
            to.credit(amount);

            System.out.println("Transfer successful " + amount + " from " + fromId + " to " + toId);
        }
        catch(Exception e){
            from.credit(originalFromBalance - from.getBalance());
            try {
                to.debit(to.getBalance() - originalToBalance);
            } catch (Exception ex) {
                System.out.println("Rollback failed for 'to' account: " + ex.getMessage());
            }
            System.out.println("Transfer failed " + e.getMessage());
        }
    }
    public void printBalance(){
        accounts.forEach((id, account) -> {
            System.out.println("Account " + id + " balance: " + account.getBalance());
        });
    }
}