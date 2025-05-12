package lambdasfunction.functioncompositionandpipeline.q41;

import java.util.function.Function;


public class ReusablePipeline {
    public static Function<String, String> trim = String::trim;
    public static Function<String, String> toLower = String::toLowerCase;
    public static Function<String, String> removePunct = s -> s.replaceAll("\\p{Punct}", "");

    public static Function<String, String> cleanPipeLine = trim.andThen(toLower).andThen(removePunct);

    public static void main(String[] args) {
        String dirty = "Hello ,World! ";
        String cleaned = cleanPipeLine.apply(dirty);
        System.out.println(cleaned);
    }
}
