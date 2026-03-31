import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2*(len+width);
        System.out.println(perimeter);
    }
}
