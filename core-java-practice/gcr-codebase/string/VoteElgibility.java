import java.util.Scanner;
public class VoteElgibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = AgeGenerate(n);
        String[][] result = VoteEligibility(ages);
        displayResult(result);
    }
    public static int[] AgeGenerate(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }
    public static String[][] VoteEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    public static void displayResult(String[][] result) {
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    
    }
}
