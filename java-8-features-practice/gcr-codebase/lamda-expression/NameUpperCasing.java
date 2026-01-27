package lamda_expression;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class NameUpperCasing {
	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<>();
	     employees.add(new Employee("Aditya"));
	     employees.add(new Employee("Suraj"));
         employees.add(new Employee("Sammer"));
	     employees.add(new Employee("Dheeraj"));
	     employees.add(new Employee("madhav"));

	     System.out.println("Employee names in uppercase:");
	     employees.stream()
         	.map(e -> e.getName())   
         	.map(name -> name.toUpperCase()) 
         	.forEach(name -> System.out.println(name));
	}
}
