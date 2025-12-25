class Employee {
    static String companyName;
    static void setCompanyName(String name) {
        companyName = name;
    }
    static int totalEmployee =0;
    static String getCompanyName() {
        return companyName;
    }
    final int id;
    String name;
    String designation;
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployee++;
    }           
    void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }
    public static void displayTotalEmployees() {
       System.out.println("Total no. of Employees: " + totalEmployee);
   }

}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee.setCompanyName("Amazon");
        Employee.displayTotalEmployees();
        Employee emp1 = new Employee(101, "Ram", "Software Engineer");
        Employee emp2 = new Employee(102, "Aditya", "Software Engineer");
        System.out.println("Company Name: " + Employee.getCompanyName());
        System.out.println();

        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }
        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }
    }
}
