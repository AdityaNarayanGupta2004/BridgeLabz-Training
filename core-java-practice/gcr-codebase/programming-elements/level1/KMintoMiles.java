import java.util.*;
public class KMintoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Km = sc.nextDouble();
        double miles = Km * 1.6; 
        System.out.printf("Distance in "+ Km +" into  miles is "+ miles);
    }
}
