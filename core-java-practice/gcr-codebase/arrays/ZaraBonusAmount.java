import java.util.*;
public class ZaraBonusAmount {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; 
        double[][] result = new double[10][2];
        double totalBonus = 0;
        int OldSalary = 0;
        int  NewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            double salary, years;
            while (true) {
                System.out.print(" Enter salary: ");
                salary = sc.nextDouble();
                System.out.print("  Enter years of service ");
                years = sc.nextDouble();
                if (salary >= 0 && years >= 0) break;
                System.out.println(" Invalid input. Try again.");
            }
            data[i][0] = salary;
            data[i][1] = years;
        }
        for (int i = 0; i < 10; i++) {
            double sal = data[i][0], yrs = data[i][1];
            double bonus = sal * (yrs > 5 ? 0.05 : 0.02);
            double newSal = sal + bonus;

            result[i][0] = newSal;
            result[i][1] = bonus;

            OldSalary += sal;
            totalBonus += bonus;
            NewSalary += newSal;
        }

        System.out.printf("\nTotal Old Salary: $%.2f\n", OldSalary);
        System.out.printf("Total Bonus Paid: $%.2f\n", totalBonus);
        System.out.printf("Total New Salary: $%.2f\n", NewSalary);

        sc.close();
    }
}
