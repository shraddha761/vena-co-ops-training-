package lambdasfunction.customtype;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Item> items;

    Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() { return items; }
}

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


