package Java_OOP_Concepts.Q1BookLibrary;

public class Main {
    public static void main(String[] args) {
        library library = new library();

        // Add books
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467"));

        String searchTitle = "1984";
        Book foundBook = library.searchByTitle(searchTitle);

        if (foundBook != null) {
            System.out.println("Book found:");
            foundBook.printDetails();
        } else {
            System.out.println("Book with title '" + searchTitle + "' not found.");
        }
    }
}
