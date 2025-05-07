package lambdasfunction.level5.order;

public class Order {
    private final String customerName;
    private final String status;
    private final double amount;

    public Order(String customerName, String status, double amount) {
        this.customerName = customerName;
        this.status = status;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }
    public double getAmount() {
        return amount;
    }

    public String toString() {
        return String.format("Order{customer='%s', status='%s', amount=%.2f}", customerName, status, amount);
    }
}
