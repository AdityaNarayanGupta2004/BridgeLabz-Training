import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int orignum = number;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if (orignum % sum == 0) {
            System.out.println(orignum + " is a Harshad Number.");
        } else {
            System.out.println(orignum + " is NOT a Harshad Number.");
        }
    }
}
