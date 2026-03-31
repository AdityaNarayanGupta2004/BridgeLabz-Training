import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            height[i] = sc.nextDouble();
        }
        int youngestIdx = 0;
        int tallestIdx = 0;
        for(int i = 1; i < 3; i++){
            if(age[i] < age[youngestIdx]) youngestIdx = i;
            if(height[i] > height[tallestIdx]) tallestIdx = i;
        }
        System.out.println("Youngest: " + names[youngestIdx]);
        System.out.println("Tallest: " + names[tallestIdx]);
    }
}
