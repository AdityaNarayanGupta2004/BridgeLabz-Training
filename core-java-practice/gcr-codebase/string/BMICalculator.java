import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];
        for(int i = 0; i < 10; i++){
            System.out.print("Enter weight in kg " + (i + 1) + ": ");
            input[i][0] = sc.nextDouble();
            System.out.print("Enter height in cm" + (i + 1) + ": ");
            input[i][1] = sc.nextDouble();
        }
        String[][] results = calculateBMI(input);
        displayResults(results);
    }
        public static String[][] calculateBMI(double[][] data){
        String[][] result = new String[10][4];
        for(int i = 0; i < 10; i++){
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void displayResults(String[][] results) {
        for(int i = 0; i < results.length; i++){
            System.out.printf(results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
}
