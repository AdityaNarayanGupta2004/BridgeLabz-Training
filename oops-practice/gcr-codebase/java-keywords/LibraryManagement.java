class Book {
    static String libraryName; // static variables shared across all instance
    // instance variables
    final int isbn; // final keyword
    String title;
    String author;
        public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
        public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author of book is : " + author);
    }
        static void setLibraryName(String name) {
        libraryName = name;
    }
        static String DisplayLibraryName() {
        return libraryName;
    }    
    public String getTitle() {
       return title;
   }
   public String getAuthor() {
       return author;
   }
   public int getIsbn() {
       return isbn;
   }

}
public class LibraryManagement {
    public static void main(String[] args) {
        Book.setLibraryName("Central Library");

        Book book1 = new Book(124556, "Java Programming", "Ram");
        Book book2 = new Book(789045, "Data Structures", "Shyam");

        System.out.println("Library Name is : " + Book.DisplayLibraryName());
        System.out.println();

        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        System.out.println();
        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}
