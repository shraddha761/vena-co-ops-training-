package lambdasfunction.level1;

public class BiFunction {
    public static void main(String[] args) {

        // BiFunction: returns sum of integers
        java.util.function.BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
            if (a == null || b == null) {
                throw new IllegalArgumentException("Arguments must not be null");
            }
            return a + b;
        };

        System.out.println(sum.apply(1, 2));  // Give sum of negative number also
    }
}
