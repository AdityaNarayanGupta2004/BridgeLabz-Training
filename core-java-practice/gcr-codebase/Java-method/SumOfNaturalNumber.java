import java.util.*;
public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Its a natural number");
            int sumUsingFormula = num*(num+1)/2;
            int ans = sumOfNaturalNumbers(num); // calling a function
            System.out.println("Sum of first " + num + " natural numbers is: " + ans);
        }else{
            System.out.println("Its not a natural number");
        }
        

        sc.close();
    }
    public static int sumOfNaturalNumbers(int num){
        if(num <= 0){
            return 0;
        }
        
        return num + sumOfNaturalNumbers(num - 1);
    }
}
