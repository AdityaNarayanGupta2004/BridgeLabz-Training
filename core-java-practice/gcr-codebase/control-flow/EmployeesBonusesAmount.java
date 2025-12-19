import java.util.*;

public class EmployeesBonusesAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int year = sc.nextInt();
        if(year > 5){
            double bonus = 0.05 * salary;
            System.out.println("Bonuses amount: " + bonus);
        }else{
            System.out.println("No bonus for the Employee");
        }
    }
}
