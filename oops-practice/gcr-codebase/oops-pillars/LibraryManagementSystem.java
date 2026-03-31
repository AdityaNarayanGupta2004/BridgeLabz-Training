import java.util.*;
// Abstract class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Applying concept of the encapsulation
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    // Adding Abstract Method
    public abstract int getLoanDuration();  // in days
}

// making a interface named-> Reservable
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

//  Making a subclass named-> Book 
// Applying a concept of inheritance and interface 
class Book extends LibraryItem implements Reservable {
    private String borrower;
    private boolean reserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    // Applying a concept of polymorphism(Overiding)
    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            this.borrower = borrowerName;
            reserved = true;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private String borrower;
    private boolean reserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            this.borrower = borrowerName;
            reserved = true;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private String borrower;
    private boolean reserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }
    
    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            this.borrower = borrowerName;
            reserved = true;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "The Alchemist", "Paulo Coelho"));
        items.add(new Magazine("M202", "National Geographic", "Nat Geo"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reserve = (Reservable) item;
                System.out.println("Available? " + (reserve.checkAvailability() ? "Yes" : "No"));
                reserve.reserveItem("John Doe");
                System.out.println("Available after reservation? " + (reserve.checkAvailability() ? "Yes" : "No"));
            }
            System.out.println();
        }
    }
}
