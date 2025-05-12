package lambdasfunction.bonus.q52;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListFilterer {

    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)
                .peek(item -> System.out.println("Filtered item: " + item)) // Log each item
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbers = filterAndLog(numbers, isEven);

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
