package lambdasfunction.level5.order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderPipeline {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Shraddha", "Completed", 250.0),
                new Order("Krishan", "Pending", 150.0),
                new Order("Radha", "Cancelled", 100.0),
                new Order("Pratham", "Completed", 200.0)
        );

        List<String> customerNames = orders.stream()
                .filter(order -> "Completed".equalsIgnoreCase(order.getStatus()))
                .sorted(Comparator.comparingDouble(Order::getAmount).reversed())
                .map(Order::getCustomerName)
                .toList();

        System.out.println(customerNames);
    }
}
