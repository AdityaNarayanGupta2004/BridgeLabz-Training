import java.util.*;
public class VolumeOfEarth {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int radius=sc.nextInt();
        double pi = 3.14;
        double metrevol = (4.0/3) * pi * radius * radius * radius;
        double milevol=metrevol*1.6*1.6*1.6;
        System.out.printf("Volume of Earth in cubic metres "+metrevol+" and in cubic miles "+ milevol);
    }
}
