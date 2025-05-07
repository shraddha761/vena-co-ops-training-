package CollectionsFrameWork.Q14RestaurantOrderSystem;

public class Order {
    private int orderId;
    private String description;

    Order(int orderId, String description) {
        this.orderId = orderId;
        this.description = description;
    }

    public String toString() {
        return "Order#" + orderId + ": " + description;
    }
}
