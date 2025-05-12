package exceptionhandling.q7;

public class SuppressedExceptionDemo {
    public static void main(String[] args) {
        try(ResourceA a = new ResourceA();
        ResourceB b = new ResourceB()){
            System.out.println("Inside try block");
            throw new Exception("Primary exception from try block");
        }
        catch(Exception e) {
            System.out.println("Caught: " + e.getMessage());

            for(Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed: " + throwable.getMessage());
            }
        }
    }
}
