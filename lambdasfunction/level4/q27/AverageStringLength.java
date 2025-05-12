package lambdasfunction.level4.q27;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class AverageStringLength {
    public static OptionalDouble aveageStringLength(List<String> words){
        return words.stream()
                .filter(Objects::nonNull)
                .mapToInt(String::length)
                .average();
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", null, "apple", "Cherry", "banana", "date", "");

        System.out.println("6. Average String length : " + aveageStringLength(words).orElse(0.0));
    }
}