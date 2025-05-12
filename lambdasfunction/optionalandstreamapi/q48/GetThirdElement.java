package lambdasfunction.optionalandstreamapi.q48;

import java.util.List;
import java.util.Optional;

public class GetThirdElement {

    public static <T> Optional<T> getThirdElement(List<T> list) {
        if (list == null) {
            return Optional.empty();
        }
        return list.stream()
                .skip(2)
                .findFirst();
    }

    public static void main(String[] args) {
        List<String> words = List.of("one", "two", "three", "four");

        Optional<String> third = getThirdElement(words);
        third.ifPresentOrElse(
                val -> System.out.println("Third element: " + val),
                () -> System.out.println("Third element not present")
        );

    }
}
