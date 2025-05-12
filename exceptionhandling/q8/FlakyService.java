package exceptionhandling.q8;

class FlakyService{
    private int attempts = 0;

    public String readData() throws Exception {
        attempts++;
        if (attempts < 3) {
            throw new Exception("FlakyService failed on attempt " + attempts);
        }
        return "Service data on attempt " + attempts;
    }
}