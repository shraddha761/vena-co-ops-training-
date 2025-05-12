package lambdasfunction.level2.q11;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CountStrings {
    public static void main(String[] args) {
        // 4. Count Strings starts with "S" for both lower and upper case
        List<String> strings = Arrays.asList("apple", null, "Banana", " ", "Strawberry", "");

        long countStartsWithS = strings.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .filter(s -> s.toUpperCase().startsWith("S"))
                .count();
        System.out.println(countStartsWithS);

    }
}
