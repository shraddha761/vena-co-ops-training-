package CollectionsFrameWork.Q6libraryCatlog;

import CollectionsFrameWork.Q6libraryCatlog.Book;

import java.util.*;

public class LibraryCatalog {
    private Map<String, Set<Book>> catalog = new HashMap<>();

    public void addBook(String genre, Book book) {
        catalog.computeIfAbsent(genre, k -> new HashSet<>()).add(book);
    }

    public void printBooksInGenre(String genre) {
        Set<Book> books = catalog.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        books.stream()
                .sorted(Comparator.comparingInt(Book::getPublicationYear))
                .forEach(System.out::println);
    }
}
