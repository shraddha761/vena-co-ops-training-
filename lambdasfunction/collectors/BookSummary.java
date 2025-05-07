package lambdasfunction.collectors;

import java.util.Arrays;
import java.util.List;

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
public class BookSummary {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book A", 4.5, 100),
                new Book("Book B", 3.8, 150),
                new Book("Book C", 4.2, 200)
        );
        int totalCount = books.size();
        double averageRating = books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0);

        int totalPrice = books.stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);

        System.out.println("Book Summary: ");
        System.out.println("Total Count" + totalCount);
        System.out.println("Average Rating " + String.format("%.2f", averageRating));
        System.out.println("Total Price" + totalPrice);
    }
}
