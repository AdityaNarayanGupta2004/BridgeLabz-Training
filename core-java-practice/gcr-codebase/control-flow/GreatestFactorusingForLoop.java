import java.util.*;
public class GreatestFactorusingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatestfactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestfactor = i;
                break;
            }
        }
        System.out.println(greatestfactor);
    }
}
