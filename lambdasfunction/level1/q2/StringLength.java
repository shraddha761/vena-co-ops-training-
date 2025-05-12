package lambdasfunction.level1.q2;

import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {

        // Functions: returns length of string
        Function<String, Integer> stringLength = s -> s.trim().length();

        System.out.println(stringLength.apply("hello")); // Without white space
        System.out.println(stringLength.apply("    hello    "));  // With white space
    }
}
