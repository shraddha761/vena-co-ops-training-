package lambdasfunction.level2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        // 1. Filter a list of integers to only even numbers (handle null, negative)
        List<Integer> numbers = Arrays.asList(2, null, 3, 4, 5, 6, null, 0, -8);

        List<Integer> evenNumbers = numbers.stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

    }
}
