import java.util.*;
// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    // Constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Employee Name: " + name + ", Base Salary: " + baseSalary);
    }
}
// Interface name Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedBonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double fixedBonus) {
        super(id, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        FullTimeEmployee fulltime = new FullTimeEmployee(101, "Alice", 100000, 5000);
        fulltime.assignDepartment("Software Developement");

        PartTimeEmployee parttime = new PartTimeEmployee(102, "Bob", 10000, 20, 300);
        parttime.assignDepartment("TechSupport");

        employeeList.add(fulltime);
        employeeList.add(parttime);
        System.out.println();
        for (Employee emp : employeeList) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
