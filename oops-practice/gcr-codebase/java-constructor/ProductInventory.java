import java.util.*;
public class ProductInventory {
    String productName;
    int price;
    static int totalproduct = 0;
    ProductInventory(String productName,int price){
        this.price=price;
        this.productName=productName;
    }
    ProductInventory(int totalproduct){
        totalproduct++;
    }
    public void displayProductDetails(){
        System.out.println("Product name : "+productName);
        System.out.println("Price of product : "+price);
    }
    static void displayTotalProducts(){
        System.out.println("total products : "+totalproduct);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter product name");
        String productName = sc.nextLine();
        System.out.println("Enter the price of product");
        int price = sc.nextInt();
        ProductInventory details = new ProductInventory(productName, price);
        System.out.println("the product details are");
        details.displayProductDetails();
        ProductInventory total = new ProductInventory(totalproduct);
        System.out.println("The total product are: ");
        total.displayTotalProducts();


    }
}
