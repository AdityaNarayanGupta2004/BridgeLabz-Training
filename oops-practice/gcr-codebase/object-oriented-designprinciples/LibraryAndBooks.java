import java.util.*;
class Library {
    private String name;
    private ArrayList<Book> books;
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}
class Book{
    private String title;
    private String author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void displayBook() {
        System.out.println(title + " by " + author);
    }
}
public class LibraryAndBooks {
    public static void main(String[] args) {

        Book book1 = new Book("2005", "JOhn");
        Book book2 = new Book("java", " Lee");

        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book1); 

        cityLibrary.displayBooks();
        schoolLibrary.displayBooks();
    }
}
