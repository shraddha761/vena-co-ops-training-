package lambdasfunction.level4;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductsOfEven {

    public static Optional<Integer> productOfEvens(List<Integer> numbers){
        return numbers.stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 6, null, 7, 8);
        System.out.println("7. Product of evens: " + productOfEvens(numbers).orElse(null));
    }
}
