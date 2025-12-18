import java.util.Scanner;
public class DiscountUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fee = sc.nextInt(); 
        int disPer= sc.nextInt();
        int disc= (fee * disPer) / 100;
        int finalfee = fee - disc;
        System.out.println("The discount amount is INR "+ disc +" and final discounted fee is INR "+ finalfee);
    }    
}

