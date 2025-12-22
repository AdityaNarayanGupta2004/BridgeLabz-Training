import java.util.*;
public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        double SI = calculateSimpleInterest(principal, rate, time);

        System.out.printf("The Simple Interest is "+ SI +" for Principal "+ principal +" Rate of Interest " + rate +" and Time "+ time);

        sc.close();
    }
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
