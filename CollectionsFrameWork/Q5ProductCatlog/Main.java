package CollectionsFrameWork.Q5ProductCatlog;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, Product> products = new TreeMap<>();
        products.put(9082, new Product(1, "Laptop", 799.99, 4.5, 20));
        products.put(9083, new Product(2, "Smartphone", 499.99, 4.2, 50));
        products.put(9084, new Product(3, "Headphones", 99.99, 4.0, 100));

        List<Map.Entry<Integer, Product>> sortedEntries = new ArrayList<>(products.entrySet());
        sortedEntries.sort((e1, e2) -> {
            Product p1 = e1.getValue();
            Product p2 = e2.getValue();
            int ratingComparison = Double.compare(p1.rating, p2.rating);
            if (ratingComparison != 0) return ratingComparison;
            return p2.name.compareTo(p1.name);
        });

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " -> Category: " + entry.getValue().name);
        }
    }
}
