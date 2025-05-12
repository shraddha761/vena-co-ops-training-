package exceptionhandling.q8;

public class RetryMechanism {
    public static String readWithRetry(FlakyService service, int maxRetries) throws ServiceUnavailableException {
        int attempts = 0;
        while (attempts < maxRetries) {
            try{
                return service.readData();
            }
            catch (Exception e) {
                attempts++;
                System.out.println("Attempt " + attempts + "failed: " + e.getMessage());
            }
        }
        throw new ServiceUnavailableException("Unexpected failure");
    }
    public static void main(String[] args) {
        FlakyService service = new FlakyService();
        try{
            String result = readWithRetry(service, 3);
            System.out.println("Success: " + result);
        }
        catch (ServiceUnavailableException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
