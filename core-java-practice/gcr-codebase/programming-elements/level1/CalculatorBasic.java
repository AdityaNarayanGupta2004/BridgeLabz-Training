import java.util.*;
public class CalculatorBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int add= num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        double div = (double) num1 / num2; 
        System.out.print("Addition: " + add);
        System.out.print(" Subtraction: " + sub);  
        System.out.print(" Multiplication: " + multi);
        System.out.print(" Division: " + div);
    }
}
