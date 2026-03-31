import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] person = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight of person in kg" + (i + 1) + ": ");
            person[i][0] = sc.nextDouble();
            System.out.print("Enter height of person in cm" + (i + 1) + ": ");
            person[i][1] = sc.nextDouble();
        }

        calculateBMI(person);
        String[] bmiStatus = getBMIStatus(person);
        for (int i = 0; i < 10; i++) {
            System.out.printf( i + 1+" "+ person[i][0] +", "+ person[i][1] +", "+ person[i][2] +", "+ bmiStatus[i]);
        }
        sc.close();
    }
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            double bmi = data[i][0] / (heightMeters * heightMeters);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}

