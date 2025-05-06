package Q3oddevenprinter;

public class Main {
    public static void main(String[] args) {
        OddEven printer = new OddEven();

        Thread oddThread = new Thread(printer::printOdd, "OddThread");
        Thread evenThread = new Thread(printer::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}
