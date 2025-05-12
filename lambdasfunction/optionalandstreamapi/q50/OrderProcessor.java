package lambdasfunction.optionalandstreamapi.q50;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class OrderProcessor {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, LocalDate.of(2024, 1, 10), Arrays.asList(100.0, 200.0)),
                new Order(2, LocalDate.of(2024, 2, 15), Arrays.asList(50.0, 75.0)),
                new Order(3, LocalDate.of(2024, 3, 20), Arrays.asList(120.0, 80.0))
        );

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 28);

        double total = orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .mapToDouble(Order::getTotalAmount)
                .sum();

        System.out.println("Total amount in date range: " + total);
    }
}

