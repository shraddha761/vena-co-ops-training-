package lambdasfunction.customtype;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class MaxOrderTotal {
    static class Item{
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
    }
    static class Order {
        private List<Item> items;
        public Order(List<Item> items) {
            this.items = items;
        }
        public List<Item> getItems() {
            return items;
        }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("A", 10), new Item("B", 20))),
                new Order(Arrays.asList(new Item("C", 40))),
                new Order(Arrays.asList(new Item("D", 5), new Item("E", 5)))
        );
        Order maxOrder = orders.stream()
                .max(Comparator.comparing(
                        order -> order.getItems().stream().mapToDouble(Item::getPrice).sum()
                ))
                .orElse(null);

        System.out.println(maxOrder == null ? "None" : maxOrder.getItems().stream().map(Item::getPrice).reduce(0.0, Double::sum));
    }
}
