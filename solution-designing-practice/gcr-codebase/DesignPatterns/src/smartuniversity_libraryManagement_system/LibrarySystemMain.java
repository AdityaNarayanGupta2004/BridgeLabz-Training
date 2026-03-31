package smartuniversity_libraryManagement_system;

import java.util.Arrays;

public class LibrarySystemMain {

    public static void main(String[] args) {

        // Singleton catalog
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory users
        User student = UserFactory.createUser("student", "Aditya");
        User faculty = UserFactory.createUser("faculty", "Mr. John");
        User librarian = UserFactory.createUser("librarian", "Mr. Mohn");

        // Observer subscription
        catalog.addUser(student);
        catalog.addUser(faculty);

        // Builder book
        Book book = new Book.BookBuilder("Java Programming")
                .authors(Arrays.asList("James Gosling"))
                .edition("3rd Edition")
                .genre("Computer Science")
                .publisher("Abc Press")
                .build();

        // Librarian adding book
        catalog.addBook(book);
    }
}
