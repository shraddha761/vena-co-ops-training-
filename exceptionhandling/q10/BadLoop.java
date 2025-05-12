package exceptionhandling.q10;


public class BadLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,3};

        try{
            for(int num : numbers){
                System.out.println("Checking : " +num);
                if(num == 7){
                    throw new BreakLoopException();
                }
            }
        }catch(BreakLoopException e){
            System.out.println("Found the number and exited the loop (using exception)");
        }
    }
}