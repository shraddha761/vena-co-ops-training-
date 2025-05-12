package lambdasfunction.level2.q9;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UpperCase {
    public static void main(String[] args) {
        // 2. Convert a list of strings to uppercase using map()
        List<String> strings = Arrays.asList("apple", null, "Banana", " ", "Strawberry", "");

        List<String> upperCase = strings.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase strings" + upperCase);

    }
}
