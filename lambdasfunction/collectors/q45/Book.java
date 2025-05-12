package lambdasfunction.collectors.q45;

class Book{
    private String title;
    private double rating;
    private int price;

    public Book(String title, double rating, int price) {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getRating() {
        return rating;
    }
    public int getPrice() {
        return price;
    }

}
