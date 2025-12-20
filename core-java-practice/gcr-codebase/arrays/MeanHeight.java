import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];
        for(int i = 0; i < 11; i++){
            height[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i = 0; i < 11; i++){
            sum += height[i];
        }
        double mean = sum / 11;
        System.out.println("The mean of players is: "+ mean);
    }
}
