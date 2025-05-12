package lambdasfunction.functioncompositionandpipeline.q42;

import java.util.function.Function;

public class Parsing {

    public static Function<String, Integer> parseInt = Integer::parseInt;
    public static Function<Integer, Integer> doubleIt = x -> (x * 2);
    public static Function<String, Integer> parseAndDouble = parseInt.andThen(doubleIt);

    public static void main(String[] args) {
        String numberStr = "21";
        int doubled = parseAndDouble.apply(numberStr);
        System.out.println(doubled);

    }
}
