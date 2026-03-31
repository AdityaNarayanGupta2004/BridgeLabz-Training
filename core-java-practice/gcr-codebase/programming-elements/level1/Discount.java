import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fee = 125000;
        int discountPercent = 10;
        int disc = (fee*discountPercent) / 100;
        int finalfee = fee-disc;
        System.out.println("The discount amount is INR "+ disc +" and final discounted fee is INR "+ finalfee);
    }    
}
