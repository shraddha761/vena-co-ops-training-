package lambdasfunction.level1;

import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {

        // Supplier: generates a random number
        Supplier<Double> randomDouble = Math::random;

        System.out.println(randomDouble.get());
    }
}
