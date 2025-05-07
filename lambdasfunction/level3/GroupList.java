package lambdasfunction.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupList {
    public static void main(String[] args) {
        // 1. Group list of names by their first letter
        List<String> names = Arrays.asList("Shraddha", "Krishan", "Radha", null, "Abhay", " ", "Pratham", "");

        Map<String, List<String>> groupedByFirstLetter = names.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(name -> name.substring(0, 1).toUpperCase()));
        System.out.println(groupedByFirstLetter);
    }
}
