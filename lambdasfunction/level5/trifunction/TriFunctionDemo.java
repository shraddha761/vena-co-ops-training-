package lambdasfunction.level5.trifunction;

public class TriFunctionDemo {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> sumThree = (a, b, c) -> a + b + c;
        int result = sumThree.apply(1, 2, 3);
        System.out.println("Sum: " + result); // Output: Sum: 6
    }
}

