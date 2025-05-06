package Q3oddevenprinter;

public class OddEven {
    private static final int max = 100;
    private int number = 1;
    private final Object lock = new Object();

    public void printOdd(){
        while(true){
            synchronized (lock){
                while(number % 2 == 0){
                    try{
                        lock.wait();
                    }
                    catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                if(number > max){
                    lock.notify(); // Let even thread exit if waiting
                    break;
                }
                System.out.println(number + " ");
                number++;
                lock.notify();
            }
        }
    }

    public void printEven(){
        while(true){
            synchronized (lock){
                while (number % 2 == 1){ // Not even's turn
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                if(number > max){
                    lock.notify(); // Let odd thread exit if waiting
                    break;
                }
                System.out.println(number + " ");
                number++;
                lock.notify();
            }
        }
    }
}

