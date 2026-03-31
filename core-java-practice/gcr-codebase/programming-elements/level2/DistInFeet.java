import java.util.*;
public class DistInFeet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int feet = sc.nextInt();
        int distInyards = feet * 3;
        int distInMiles = feet / 5280;
        System.out.println("The distance in yards is "+ distInyards+" while the distance in miles is "+ distInMiles);
    }
}
