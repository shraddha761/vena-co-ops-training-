package lambdasfunction.level1.q1;

import java.util.function.Predicate;

public class StringPredicate {
    public static void main(String[] args) {

        //Predicate: true if string starts with "A" (case-insensitive)
        Predicate<String> startsWith = s -> s.toLowerCase().startsWith("a");

        System.out.println(startsWith.test("apple")); // Test with lower case
        System.out.println(startsWith.test("Apple")); // Test with upper case
    }
}