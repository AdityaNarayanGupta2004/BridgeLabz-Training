import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maya BMI Fitness Tracker");
        System.out.println("Enter the height in meters:");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in kg:");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your BMI Category is: ");
        if(bmi < 18.5){
            System.out.println("Underweight");
            System.out.println("Please increase some weight to come under the normal");
        }else if(bmi < 25){
            System.out.println("Normal");
            System.out.println("You are at good stage");
        }else{
            System.out.println("Overweight");
            System.out.println("Decrease some weight to come in the category of normal");
        }
        System.out.println("Thank You for using BMI fitness Tracker");
    }
}
