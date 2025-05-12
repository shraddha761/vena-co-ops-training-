package lambdasfunction.functioncompositionandpipeline.q43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class GenericMapper {

    public static <T, R> List<R> mapList(List<T> inputList, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T item : inputList) {
            result.add(mapper.apply(item));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList(" Shraddha ", " Krishan ", " Radha ");
        List<Integer> nameLengths = mapList(names, String::length);
        System.out.println(nameLengths);
    }
}

