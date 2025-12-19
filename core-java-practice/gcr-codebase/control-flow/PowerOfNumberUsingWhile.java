import java.util.*;

public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int res = 1;
        int idx=1;
        while(idx <= exponent) {
            res *= base;
            idx++;
        }
        System.out.println(base + " to the power " + exponent + " is = " + res);
    }
}
