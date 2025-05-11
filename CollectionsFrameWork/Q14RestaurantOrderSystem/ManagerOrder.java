package CollectionsFrameWork.Q14RestaurantOrderSystem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ManagerOrder {
    Deque<Order> currentOrders = new ArrayDeque<>();
    List<Order> orderHistory = new ArrayList<>();

    void addOrderFront(Order order) {
        currentOrders.addFirst(order);
    }
    void addOrderBack(Order order) {
        currentOrders.addLast(order);
    }

    void processOrderFromFront(){
        if (!currentOrders.isEmpty()) {
            Order order = currentOrders.pollFirst();
            orderHistory.add(order);
            System.out.println("Processed from front: " + order);
        } else {
            System.out.println("No orders to process from front.");
        }
    }
    void processOrderFromBack(){
        if (!currentOrders.isEmpty()) {
            Order order = currentOrders.pollLast();
            orderHistory.add(order);
            System.out.println("Processed from back: " + order);
        } else {
            System.out.println("No orders to process from back.");
        }
    }
    void showCurrentOrders(){
        System.out.println("Current Orders: " + currentOrders);
    }
    void showOrderHistory(){
        System.out.println("Order History: " + orderHistory);
    }

}
