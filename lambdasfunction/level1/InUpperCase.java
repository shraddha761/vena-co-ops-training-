package lambdasfunction.level1;

import java.util.function.Consumer;

public class InUpperCase {
    public static void main(String[] args) {
        // Consumer: prints string in uppercase
        Consumer<String> printUpperCase = s -> {
            if (s != null) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println("Input is null");
            }
        };

        printUpperCase.accept("functional");
    }
}
