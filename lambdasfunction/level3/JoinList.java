package lambdasfunction.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JoinList {
    public static void main(String[] args) {
        // 3. Join a list of strings into a single comma - separated string
        List<String> strings = Arrays.asList("Java", null, "Streams", "are", "powerful", "", "and", "fun");

        String joined = strings.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}
