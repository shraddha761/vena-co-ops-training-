package lambdasfunction.customtype.q37;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxOrderFinder {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, Arrays.asList(new Item(10), new Item(20))),
                new Order(2, Arrays.asList(new Item(15), new Item(25))),
                new Order(3, Arrays.asList(new Item(5), new Item(7)))
        );

        Order maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getTotalPrice))
                .orElse(null);

        if (maxOrder != null) {
            System.out.println("Order with highest total price:");
            System.out.println("Order ID: " + maxOrder.getOrderId());
            System.out.println("Total Price: " + maxOrder.getTotalPrice());
        } else {
            System.out.println("No orders found.");
        }
    }
}
