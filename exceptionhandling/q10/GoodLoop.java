package exceptionhandling.q10;

public class GoodLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,6,7,8,9,10};

        for(int num : numbers) {
            System.out.println("Checking: " + num);
            if(num == 9){
                System.out.println("Found the number and exited the loop (using break)");
                break;
            }
        }
    }
}