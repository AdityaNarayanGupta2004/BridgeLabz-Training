package junit.demo.employeewage;

import java.util.*;
import java.util.stream.IntStream;

public class EmployeeWageMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage builder = new EmployeeWage();

        builder.addCompanyEmpWage("TCS", 20, 20, 100);
        builder.addCompanyEmpWage("Infosys", 25, 22, 120);
        builder.addCompanyEmpWage("Wipro", 30, 18, 90);

        builder.computeEmpWage();

        System.out.println("Queried Wage for TCS: " +
                builder.getTotalWage("TCS"));
		
		
	}
}
