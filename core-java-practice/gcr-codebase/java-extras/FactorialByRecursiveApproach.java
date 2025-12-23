import java.util.*;
public class FactorialByRecursiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long result = calculateFactorial(number);
        displayResult(number, result);
    }
    static long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);
    }
    static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
