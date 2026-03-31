class Employees{ // base class
    String name;
    int id;
    int salary;
    // Constructor
    Employees(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
// sub class of Employee
class Manager extends Employees{
    int teamSize;

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
}
class Developer extends Employees{
    String programmingLanguage;
    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
}
class Intern extends Employees{
    public Intern(String name, int id, int salary) {
        super(name, id, salary);
    }
}
// main class 
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println();
        Employees e = new Employees("sohan", 1, 20000);
        System.out.println("Employee name : " + e.name + ", Employee ID: " + e.id + ", Employee Salary: " + e.salary);
        Manager m = new Manager("Aditya", 1, 100000, 10);
        System.out.println("Manager Name: " + m.name + ",Manager ID: " + m.id + ", Manager Salary: " + m.salary + ", Team Size: " + m.teamSize);
        Developer d = new Developer("Aditya", 1, 100000, "Java");
        System.out.println("Developer Name: " + d.name + ",Developer ID: " + d.id + ", Salary: " + d.salary + ", Programming Language: " + d.programmingLanguage);
        Intern i = new Intern("Madhav", 1, 15000);
        System.out.println("Intern name: " + i.name + ",Intern ID: " + i.id + ", Salary: " + i.salary);
    }
}   