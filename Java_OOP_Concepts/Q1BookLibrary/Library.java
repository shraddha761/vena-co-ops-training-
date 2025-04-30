package Java_OOP_Concepts.Q1BookLibrary;

import java.util.ArrayList;
import java.util.List;

public class library {
    private List<Book> books;

    public library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
