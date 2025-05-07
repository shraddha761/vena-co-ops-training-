package lambdasfunction.level1;

import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        // Lambda to sort a list alphabetically
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
        list.sort(String::compareToIgnoreCase);

        System.out.println(list); // Ignore case also
    }
}
