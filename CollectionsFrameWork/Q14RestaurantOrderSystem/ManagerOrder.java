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
        while(!currentOrders.isEmpty()){
            Order order = currentOrders.pollFirst();
            orderHistory.add(order);
        }
    }
    void processOrderFromBack(){
        while(!orderHistory.isEmpty()){
            Order order = orderHistory.remove(0);
            orderHistory.add(order);
        }
    }
    void showCurrentOrders(){
        System.out.println(currentOrders);
    }
    void showOrderHistory(){
        System.out.println(orderHistory);
    }

}
