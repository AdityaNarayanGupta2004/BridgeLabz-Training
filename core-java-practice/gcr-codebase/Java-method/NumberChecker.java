import java.util.*;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int ans = checkNumber(num);

        if (ans == 1) {
            System.out.println("The number is positive");
        } else if (ans == -1) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        sc.close();
    }
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
