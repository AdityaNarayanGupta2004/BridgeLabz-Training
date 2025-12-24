import java.util.*;
public class LibraryBookSystem {
    String bookName;
    String authorName;
    boolean isAvailable;
    int price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name:");
        String bookName = sc.nextLine();

        System.out.println("Enter the author name:");
        String authorName = sc.nextLine();

        System.out.println("Is the book available:");
        boolean isAvailable = sc.nextBoolean();

        System.out.println("Enter the price of the book:");
        int price = sc.nextInt();

        LibraryBookSystem library = new LibraryBookSystem(bookName, authorName, isAvailable, price);
        
        System.out.println("Library Details:");
        library.Details();

        System.out.println("Borrowing the book");
        library.borrowBook();
    }
    LibraryBookSystem(String bookName, String authorName, boolean isAvailable, int price) { // parameterised constructor
        this.bookName = bookName;
        this.authorName = authorName;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    LibraryBookSystem() { // default constructor
        bookName = "Java Programming";
        authorName = "James Gosling";
        isAvailable = true;
        price = 100;
    }

    public boolean borrowBook(){ // method to borror book
        if(isAvailable){
            isAvailable = false;
            System.out.println("Yes, the book is available: " + bookName);
            return true;
        }else{
            System.out.println("Sorry, the book is currently not available.");
            return false;
        }
    }

    public void Details(){
        System.out.println("Book Name    : " + bookName);
        System.out.println("Author of book is  : " + authorName);
        System.out.println("Is the book is Available : " + isAvailable);
        System.out.println("Price of the book is : " + price);
    }
}
