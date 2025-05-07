package lambdasfunction.level2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ConvertingList {
    public static void main(String[] args) {
        // 7. Convert list of integers into a list of their squares
        List<Integer> numbers = Arrays.asList(2, null, 3, 4, 5, 6, null, 0, -8);

        List<Integer> squares = numbers.stream()
                .filter(Objects::nonNull)
                .map(n -> n * n)
                .toList();
        System.out.println(squares);
    }
}
