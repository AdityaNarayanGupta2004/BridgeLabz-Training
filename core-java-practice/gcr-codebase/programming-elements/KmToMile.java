import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mile = km * 0.621371;
        System.out.println(mile);
    }
}
