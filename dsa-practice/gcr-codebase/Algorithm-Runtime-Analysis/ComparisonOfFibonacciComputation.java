import java.util.*;
public class ComparisonOfFibonacciComputation{
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] testValue = {10, 30, 40, 45};
        for(int n : testValue){
            System.out.println("Fibonacci Number for n = " + n);
            // Recursive approach
            if(n <= 45){
                long startRec = System.currentTimeMillis();
                int fibRec = fibonacciRecursive(n);
                long endRec = System.currentTimeMillis();
                System.out.println("Recursive: " + fibRec + " (Time: " + (endRec - startRec) + " ms)");
            }else{
                System.out.println("Recursive: Unfeasible for large n");
            }
            // Iterative approach
            long startItr = System.currentTimeMillis();
            int fibItr = fibonacciIterative(n);
            long endItr = System.currentTimeMillis();
            System.out.println("Iterative: " + fibItr + " (Time: " + (endItr - startItr) + " ms)");
        }
    }
    public static int fibonacciRecursive(int n){
        if(n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n){
        if(n <= 1) return n;
        int first = 0;
        int second = 1;
        int sum = 0;
        for(int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
