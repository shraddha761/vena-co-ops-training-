package lambdasfunction.dataprocessing.q33;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {
    public static void main(String[] args) {
        List<List<Integer>> listofLists = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        List<Integer> distinctEven = listofLists.stream()
                .flatMap(Collection::stream)
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctEven);
    }
}
