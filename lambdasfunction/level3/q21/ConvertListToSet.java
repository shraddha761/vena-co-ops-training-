package lambdasfunction.level3.q21;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 3, 5, 8, null, 12, 15, 7, 0, -5, 20);

        Set<Integer> numberSet = numbers.stream().filter(Objects::nonNull)
                .collect(Collectors.toSet());
        System.out.println(numberSet);
    }
}
