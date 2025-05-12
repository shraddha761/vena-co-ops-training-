package lambdasfunction.customtype.q36;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FlatItemNames {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order (Arrays.asList(new Item("Apple"), new Item("Banana"))),
                new Order (Arrays.asList(new Item("carrot"), new Item("Bananan"))),
                new Order (Arrays.asList(new Item("Eggplant")))
        );

        List<String> allItemNames = orders.stream()
                .filter(Objects::nonNull)
                .flatMap(order -> order.getItems().stream())
                .filter(Objects::nonNull)
                .map(Item::getName)
                .distinct()
                .sorted()
                .toList();

        System.out.println(allItemNames);
    }
}


