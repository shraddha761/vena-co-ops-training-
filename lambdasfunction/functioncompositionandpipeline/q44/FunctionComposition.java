package lambdasfunction.functioncompositionandpipeline.q44;

import java.util.function.Function;

public class FunctionComposition {
    public static void functionComposition(){
        Function<Integer,Integer> multiply = x -> x * 3;
        Function<Integer, Integer> add = x -> x + 5;

        Function<Integer, Integer> compose = multiply.compose(add);
        Function<Integer, Integer> andThen = multiply.andThen(add);

        System.out.println(compose.apply(3));
        System.out.println(andThen.apply(3));
    }

    public static void main(String[] args) {
        functionComposition();
    }
}
