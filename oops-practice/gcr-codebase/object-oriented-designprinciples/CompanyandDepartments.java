import java.util.*;
class Employee {
    private String name;
    private int id;

    // constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    public void closeCompany() {
        departments.clear(); // Departments and Employees removed
        System.out.println("Company closed. All departments and employees deleted.");
    }
}

public class CompanyandDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        company.addDepartment("Information Technology");
        company.addDepartment("Hiring Representative");

        company.getDepartment(0).addEmployee("mohan", 101);
        company.getDepartment(0).addEmployee("sihan", 102);
        company.getDepartment(1).addEmployee("Charlie", 201);

        company.displayCompany();
        company.closeCompany();
    }
}
