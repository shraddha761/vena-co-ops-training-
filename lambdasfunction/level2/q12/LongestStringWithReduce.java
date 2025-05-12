package lambdasfunction.level2.q12;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LongestStringWithReduce {
    public static void main(String[] args) {
        // 5. Find longest string in list with reduce()
        List<String> strings = Arrays.asList("apple", null, "Banana", " ", "Strawberry", "");

        Optional<String> longest = strings.stream()
                .filter(Objects::nonNull)
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println(longest.isPresent());

    }
}
