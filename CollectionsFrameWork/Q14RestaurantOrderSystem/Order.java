package CollectionsFrameWork.Q14RestaurantOrderSystem;

public class Order {
    int orderId;
    String description;

    Order(int orderId, String description) {
        this.orderId = orderId;
        this.description = description;
    }

    public String toString() {
        return "Order#" + orderId + ": " + description;
    }
}
