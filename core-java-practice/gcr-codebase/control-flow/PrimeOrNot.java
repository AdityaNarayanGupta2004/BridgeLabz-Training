import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number <= 1){
            System.out.println(number +" is Not a prime number");
            sc.close();
        }else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number +" is Not a prime number");
                    sc.close(); 
                }
            }
        }
        System.out.println(number +" is  a prime number");

    }
}
