package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}


public class EmployeeSalaryCategorization {
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Aditya", "IT", 60000),
	            new Employee("Dherraj", "IT", 75000),
	            new Employee("Aman", "HR", 82000),
	            new Employee("Suraj", "HR", 65000),
	            new Employee("Ankit", "Finance", 90000));
		
		 Map<String, Double> avgSalaryByDept = employees.stream()
				 .collect(Collectors.groupingBy(
						 Employee::getDepartment,
		                 Collectors.averagingDouble(Employee::getSalary)));
		 avgSalaryByDept.forEach((dept, avgSalary) ->
		 	System.out.println(dept + ": $" + avgSalary));
	}
}
