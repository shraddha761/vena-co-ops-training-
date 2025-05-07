package lambdasfunction.level4;

import java.util.function.Function;

public class ComposeUpperCaseAndExclaim {
    public static Function<String, String> composeUppercaseAndExclaim(){
        Function<String, String> toUpper = String::toUpperCase;
        Function<String, String> addExclaim = s -> s + "!";
        return toUpper.andThen(addExclaim);
    }

    public static void main(String[] args) {
        System.out.println("2. Compose functions: " + composeUppercaseAndExclaim().apply("hello world"));
    }
}
