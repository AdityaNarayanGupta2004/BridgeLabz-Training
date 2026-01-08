import java.util.*;
public class FinallyBlockExecution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int ans = num1 / num2;
            System.out.println("Result is: " + ans);
        }catch(ArithmeticException e){
            System.out.println("number is not divide by zero");
        }finally{
            System.out.println("Operation are Completed");
            sc.close();
        }
    }
}