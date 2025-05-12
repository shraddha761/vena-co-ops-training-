package lambdasfunction.level2.q10;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListOfNames {
    public static void main(String[] args) {
        // 3. Given a list of names, return a list of names longer than 4 characters
        List<String> names = Arrays.asList("John", "Anna", null, "Christopher", "  Mike  ", "Li", "Elizabeth", "");

        List<String> longNames = names.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(name -> name.length() > 4)
                .toList();
        System.out.println("Names longer than 4 characters" + longNames);

    }
}
