package exceptionhandling.q4;


public class Q4ExceptionWrapper {
    static void methodThatThrowsAnException() throws Exception{
        throw new Exception("Original exception");
    }

    static void wrapperMethod() throws CustomException{
        try{
            methodThatThrowsAnException();
        }catch(Exception e){
            // Wrap and re-throw preserving original stack trace
            throw new CustomException("Custom message wrapping original exception", e);
        }
    }
    public static void main(String[] args) {
        try {
            wrapperMethod();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}