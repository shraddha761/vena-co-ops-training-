package lambdasfunction.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class PartitionList {
    public static void main(String[] args) {
        // 2. Partition  a list of integers into even and odd
        List<Integer> numbers = Arrays.asList(10, 3, 5, 8, null, 12, 15, 7, 0, -5, 20);

        Map<Boolean, List<Integer>> partitionedEvenOdd = numbers.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitionedEvenOdd);
    }
}
