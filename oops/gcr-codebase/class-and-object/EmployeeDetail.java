import java.util.Scanner;
class DisplayingEmployeeDetail{
    // non- static variables
    String name;
    int id;
    double salary;

    DisplayingEmployeeDetail(String name, int id, double salary) { // construtor
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();
        DisplayingEmployeeDetail emp = new DisplayingEmployeeDetail(name, id ,salary); // calling constructor
        System.out.println("Employee Details are :");
        emp.display();
    }
}
