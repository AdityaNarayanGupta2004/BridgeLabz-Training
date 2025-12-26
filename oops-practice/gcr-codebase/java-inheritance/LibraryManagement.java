// super class
class Book {
    String title;
    int publicationYear;
    // constructor
    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }
}
// subclass of book
class Author extends Book {
    String name;
    String  bio;
    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }
    // display method to print the information
    void displayInfo() {
        System.out.println("Title of the book is : " + title + ",and the publication year of book: " + publicationYear);
        System.out.println("Author of the book is : " + name + " -  " + bio);
    }
}
// main class 
class LibraryManagement {
    public static void main(String[] args) {
        Author auth = new Author("Harry Potter", 1997, "J.K. Rowling", "British author, best known for Harry Potter");
        auth.displayInfo();
    }
}
