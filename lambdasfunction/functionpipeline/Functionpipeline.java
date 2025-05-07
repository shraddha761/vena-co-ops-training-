package lambdasfunction.functionpipeline;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functionpipeline {
    public static Function<String, String> trim = String::trim;
    public static Function<String, String> toLower = String::toLowerCase;
    public static Function<String, String> removePunct = s -> s.replaceAll("\\p{Punct}", "");

    // 1.
    public static Function<String, String> cleanPipeLine = trim.andThen(toLower).andThen(removePunct);

    // 2.
    public static Function<String, Integer> parseInt = Integer::parseInt;
    public static Function<Integer, Integer> doubleIt = x -> (x * 2);
    public static Function<String, Integer> parseAndDouble = parseInt.andThen(doubleIt);

    // 3.
    public static <T,R> List<R> mapList(List<T> list, Function<T, R> func){
        return list.stream().map(func).collect(Collectors.toList());
    }

    // 4.
    public static void functionComposition(){
        Function<Integer,Integer> multiply = x -> x * 3;
        Function<Integer, Integer> add = x -> x + 5;

        Function<Integer, Integer> compose = multiply.compose(add);
        Function<Integer, Integer> andThen = multiply.andThen(add);

        System.out.println(compose.apply(3));
        System.out.println(andThen.apply(3));
    }

    public static void main(String[] args) {
        String dirty = "Hello ,World! ";
        String cleaned = cleanPipeLine.apply(dirty);
        System.out.println(cleaned);

        String numberStr = "21";
        int doubled = parseAndDouble.apply(numberStr);
        System.out.println(doubled);

        List<String> names = Arrays.asList(" Shraddha ", " Krishan ", " Radha ");
        List<String> cleanedNames = mapList(names, cleanPipeLine);
        System.out.println(cleanedNames);

        functionComposition();
    }
}
