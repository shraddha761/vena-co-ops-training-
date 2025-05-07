package lambdasfunction.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FindFirstDivByFive {
    public static void main(String[] args) {
        // 4. Find the first element in a list of integers tha is divisible by 5
        List<Integer> numbers = Arrays.asList(10, 3, 5, 8, null, 12, 15, 7, 0, -5, 20);

        Optional<Integer> firstDivBy5 = numbers.stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 5 == 0)
                .findFirst();
        System.out.println(firstDivBy5.orElse(null));
    }
}
