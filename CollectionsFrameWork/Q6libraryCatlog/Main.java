package CollectionsFrameWork.Q6libraryCatlog;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addBook("Science Fiction", new Book("Dune", "Frank Herbert", 1965));
        catalog.addBook("Science Fiction", new Book("Neuromancer", "William Gibson", 1984));
        catalog.addBook("Science Fiction", new Book("Dune", "Frank Herbert", 1965)); // Duplicate
        catalog.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", 1937));

        System.out.println("Science Fiction books:");
        catalog.printBooksInGenre("Science Fiction");

        System.out.println("\nFantasy books:");
        catalog.printBooksInGenre("Fantasy");
    }
}

