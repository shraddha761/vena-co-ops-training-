package lambdasfunction.customtype.q38;


import java.util.*;
import java.util.stream.Collectors;

public class CategoryBestProduct {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phonex", "Electronic", 4.5),
                new Product("PhoneY", "Electronics", 4.8),
                new Product("ShirtA", "Clothing", 4.2),
                new Product("ShirtB", "CLothing", 4.7),
                new Product("Blender", "Home", 4.1)
        );

        Map<String, String> categoryToBestProduct = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                opt -> opt.map(Product::getName).orElse(null)
                        )
                ));
        System.out.println(categoryToBestProduct);
    }
}
