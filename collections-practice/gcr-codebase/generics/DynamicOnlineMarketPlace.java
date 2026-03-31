import java.util.*;
class BookCategory {
    String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }
}

class ClothingCategory {
    String type;

    public ClothingCategory(String type) {
        this.type = type;
    }
}

class GadgetCategory{
    String brand;

    public GadgetCategory(String brand) {
        this.brand = brand;
    }
}

class Product<T>{
    String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display(){
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class DiscountUtil{

    public static <T extends Product<?>> void applyDiscount(T product, double percentage){

        double discount = product.price * (percentage / 100);
        product.price = product.price - discount;

        System.out.println("Discount applied: " + percentage + "%");
    }
}

class Catalog{
    List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product){
        products.add(product);
    }

    public void showAllProducts(){
        for(Product<?> p : products){
            p.display();
        }
    }
}

public class DynamicOnlineMarketPlace {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory("Programming"));

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1200, new ClothingCategory("Casual"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 30000, new GadgetCategory("Samsung"));
        Catalog catalog = new Catalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println(" Catalog ");
        catalog.showAllProducts();
    }
}
