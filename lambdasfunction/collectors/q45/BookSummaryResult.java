package lambdasfunction.collectors.q45;

class BookSummaryResult {
    private final int totalCount;
    private final double averageRating;
    private final int totalPrice;

    public BookSummaryResult(int totalCount, double averageRating, int totalPrice) {
        this.totalCount = totalCount;
        this.averageRating = averageRating;
        this.totalPrice = totalPrice;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Book Summary:\n" +
                "Total Count: " + totalCount + "\n" +
                "Average Rating: " + String.format("%.2f", averageRating) + "\n" +
                "Total Price: " + totalPrice;
    }
}
