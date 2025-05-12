package exceptionhandling.q5;

class BankAccount{
    private String accountId;
    private int balance;

    public BankAccount(String accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int amount) throws Exception {
        if(balance < amount) {
            throw new Exception("Insufficient funds in account" + accountId);
        }
        balance -= amount;
    }

    public void credit(int amount) {
        balance += amount;
    }
}