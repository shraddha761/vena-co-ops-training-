package lambdasfunction.collectors.q45;

import java.util.Arrays;
import java.util.List;

public class BookSummary {
    public static BookSummaryResult generateSummary(List<Book> books) {
        int totalCount = books.size();
        double averageRating = books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0);

        int totalPrice = books.stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);

        return new BookSummaryResult(totalCount, averageRating, totalPrice);
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book A", 4.5, 100),
                new Book("Book B", 3.8, 150),
                new Book("Book C", 4.2, 200)
        );

        BookSummaryResult summary = generateSummary(books);

        System.out.println(summary);
    }
}
