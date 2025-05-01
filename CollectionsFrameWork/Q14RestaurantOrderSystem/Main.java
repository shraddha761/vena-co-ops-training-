package CollectionsFrameWork.Q14RestaurantOrderSystem;

public class Main {
    public static void main(String[] args) {
        ManagerOrder managerOrder = new ManagerOrder();
        managerOrder.addOrderBack(new Order(54, "Burger"));
        managerOrder.addOrderFront(new Order(55, "Pizza"));
        managerOrder.addOrderBack(new Order(56, "Sandwich"));
        managerOrder.addOrderFront(new Order(57, "fries"));

        managerOrder.processOrderFromBack();
        managerOrder.processOrderFromFront();

        managerOrder.showOrderHistory();
        managerOrder.addOrderFront(new Order(58, "Pasta"));
        managerOrder.showCurrentOrders();
    }
}
