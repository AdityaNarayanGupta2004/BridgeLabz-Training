import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        int height = sc.nextInt();
        double vol = Math.PI*rad*rad*height;
        System.out.println(vol);
    }
}
