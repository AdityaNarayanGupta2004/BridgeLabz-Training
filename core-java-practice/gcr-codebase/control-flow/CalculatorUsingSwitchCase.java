import java.util.*;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double first = sc.nextDouble();
        System.out.print("Enter second number:");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /):");
        String operator = sc.next();
        double result;
        switch(operator){
            case "+":
                result = first + second;
                System.out.println("Addition: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Subtraction: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Multiplication: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid opertor");
            }
    }
}
