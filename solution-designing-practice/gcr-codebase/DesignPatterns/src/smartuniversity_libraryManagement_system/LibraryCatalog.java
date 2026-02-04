package smartuniversity_libraryManagement_system;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<User> observers = new ArrayList<>();

    // Private constructor
    private LibraryCatalog() {}

    // Singleton instance
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Observer methods
    public void addUser(User user) {
        observers.add(user);
    }

    private void notifyUsers(String message) {
        for (User user : observers) {
            user.update(message);
        }
    }

    // Catalog methods
    public void addBook(Book book) {
        books.add(book);
        notifyUsers("New book added: " + book.getTitle());
    }

    public boolean isBookAvailable(String title) {
        return books.stream().anyMatch(b -> b.getTitle().equalsIgnoreCase(title));
    }
}
