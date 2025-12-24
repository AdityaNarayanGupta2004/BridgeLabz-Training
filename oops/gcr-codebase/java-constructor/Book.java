import java.util.*;
public class Book {
    String title;
    String author;
    int prices;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book:");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book:");
        int prices = sc.nextInt();
        Book book = new Book(title, author, prices);
        System.out.println("Book Details:");
        book.display();
        Book Book2 = new Book();
        System.out.println("Default Book Details:");
        Book2.display();
    }
    // paramaetrised constructor
    Book(String title, String author, int prices) {
        this.title = title;
        this.author = author;
        this.prices = prices;
    }
    // by default constructor
    Book(){
        title="Java Programming";
        author="James";
        prices=1200;
    }
    // displaying method
    public void display() {
        System.out.println("Title of book: " + title);
        System.out.println("Author of the book is: " + author);
        System.out.println("Price of the book : " + prices);
    }
}
