import java.util.Scanner;

public class PowerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exp = sc.nextDouble();
        double base = sc.nextDouble();
        double ans = Math.pow(base,exp);
        System.out.println(ans);
    }
}
