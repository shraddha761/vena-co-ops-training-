package lambdasfunction.level4.q24;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterMapSortCollect {
    public static List<String> filterMapSortCollect(List<String> list){
        return list.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", null, "apple", "Cherry", "banana", "date", "");

        System.out.println(" Filter map: " + filterMapSortCollect(words));
    }
}
