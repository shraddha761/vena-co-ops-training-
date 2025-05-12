package lambdasfunction.level1.q5;

import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        // Lambda to sort a list alphabetically
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
       list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println(list); // Ignore case also
    }
}
