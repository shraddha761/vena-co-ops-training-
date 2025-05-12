package lambdasfunction.level4.q26;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static List<String> uniqueSortedWords(List<String> words){
        return words.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", null, "apple", "Cherry", "banana", "date", "");

        System.out.println("Unique-sorted words: " + uniqueSortedWords(words));

    }
}
