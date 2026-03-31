import java.util.*;
public class StudentScoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] scores = null;
        int n = 0;
        System.out.print("Enter the number of students: ");
        try{
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Error: Number must be positive");
                return;
            }
        }catch(Exception e){
            System.out.println("Error: Enter valid number");
            return;
        }
        scores = new float[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter score for student " + (i+1) + ": ");
            boolean valid = false;
            while(!valid){
                try{
                    float score = sc.nextFloat();
                    if(score < 0 || score > 100){
                        System.out.print("Score must be 0-100. Try again: ");
                    }else{
                        scores[i] = score;
                        valid = true;
                    }
                }catch(Exception e){
                    System.out.print("Invalid input. Enter number 0-100: ");
                    sc.next(); 
                }
            }
        }
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + scores[i];
        }
        float avg = sum / n;
        float maxScore = scores[0];
        float minScore = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if(scores[i] < minScore){
                minScore = scores[i];
            }
        }
        System.out.println("RESULTS are*-*-*-*-*: ");
        System.out.printf("Average score: %.2f\n", avg);
        System.out.printf("Highest score: %.2f\n", maxScore);
        System.out.printf("Lowest score: %.2f", minScore);
        
        System.out.println("\nScores above average (" + String.format("%.2f", avg) + "):");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (scores[i] > avg) {
                System.out.printf("Student %d: %.2f\n", (i+1), scores[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }
}
