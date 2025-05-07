package lambdasfunction.level2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WordsToLength {
    public static void main(String[] args) {
        // 8. From a list of words, create a list of their lengths
        List<String> words = Arrays.asList("hello", null, "world", "java", "  ", "", "stream");

        List<Integer> lengths = words.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .map(String::length)
                .toList();
        System.out.println(lengths);
    }
}
