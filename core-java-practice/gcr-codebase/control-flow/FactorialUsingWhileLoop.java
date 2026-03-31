import java.util.*;
public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else if (num == 0){
            System.out.println("The factorial of 0 is 1.");
        }else{
            int factorial = 1;
            int idx = 1;
            while(idx <= num){
                factorial = factorial * idx;
                idx++;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }

        sc.close();
    }
}
