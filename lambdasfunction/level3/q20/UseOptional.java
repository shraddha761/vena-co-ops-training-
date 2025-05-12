package lambdasfunction.level3.q20;

import java.util.Optional;

public class UseOptional {
    public static void main(String[] args) {
        // Example 1: value is not null
        String value1 = "Hello, World!";
        String result1 = Optional.ofNullable(value1).orElse("Default Value");
        System.out.println("Result 1: " + result1);

        // Example 2: value is null
        String value2 = null;
        String result2 = Optional.ofNullable(value2).orElse("Default Value");
        System.out.println("Result 2: " + result2);

    }
}
