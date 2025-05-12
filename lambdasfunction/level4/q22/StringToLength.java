package lambdasfunction.level4.q22;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToLength {
    public static Map<String, Integer> wordLengths(List<String> words) {
        return words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (existing, replacement) -> existing // handle duplicates
                ));
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", null, "apple", "Cherry", "banana", "date", "");
        System.out.println(" Word to length: " + wordLengths(words));
    }
}
