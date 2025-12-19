import java.util.*;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatestfactor = 1;
        int count = number - 1;
        while (count >= 1) {
            if (number % count == 0) {
                greatestfactor = count;
                break;
            }
            count--;
        }
        System.out.println("Greatest factor: " + greatestfactor);
        sc.close();
    }
}
