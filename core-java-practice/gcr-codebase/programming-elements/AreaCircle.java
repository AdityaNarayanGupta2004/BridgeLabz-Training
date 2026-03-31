import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double area = Math.PI*rad*rad;
        System.out.println(area);
    }
}
