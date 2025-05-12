package lambdasfunction.bonus.q54;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopLongestStrings {
    public static List<String> getTop3LongestStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> input = List.of(
                "apple", "banana", "watermelon", "kiwi", "grapefruit", "pear", "pineapple", "fig"
        );

        List<String> top3 = getTop3LongestStrings(input);

        System.out.println("Top 3 longest strings:");
        top3.forEach(System.out::println);
    }
}
