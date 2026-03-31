import java.util.*;

public class ArmStrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int origNumber = number;
        int sum = 0;
        while (origNumber != 0) {
            int digit = origNumber % 10;
            sum += Math.pow(digit, 3);    
            origNumber /= 10;            
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }
    }
}
