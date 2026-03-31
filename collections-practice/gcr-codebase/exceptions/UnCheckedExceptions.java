import java.util.*;
public class UnCheckedExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int ans = num1 / num2;
            System.out.println("Result: " + ans);
        }catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }catch(InputMismatchException e) {
            System.out.println("enter valid number");
        }finally{
            sc.close();
        }
    }
}