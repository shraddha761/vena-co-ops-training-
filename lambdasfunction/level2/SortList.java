package lambdasfunction.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortList {
    public static void main(String[] args) {

        // 6. Sort a list of integers in descending order using streams
        List<Integer> numbers = Arrays.asList(2, null, 3, 4, 5, 6, null, 0, -8);

        List<Integer> sortedDesc = numbers.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedDesc);
    }
}
