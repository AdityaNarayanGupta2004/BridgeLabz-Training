import java.util.*;

public class PowerOFNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int res = 1;
        for(int i=1;i<=exponent;i++){
            res*=base;
        }
        System.out.println(base + " to the power " + exponent + " is = " + res);
    }
}
