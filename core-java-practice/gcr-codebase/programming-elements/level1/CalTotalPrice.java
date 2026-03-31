import java.util.*;
public class CalTotalPrice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int unitPr = sc.nextInt();
        int qty = sc.nextInt();
        int total = unitPr * qty;
        System.out.println("Total price is " + total);
    }
}
