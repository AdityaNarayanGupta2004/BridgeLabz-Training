package reflection;

import java.lang.reflect.Constructor;

class Student{
	private String name;
	private int age;
	
	Student(String name, int age){
		this.age = age;
		this.name = name;
	}
	void display() {
		System.out.println("Name is: "+ name+", and the age is: "+ age);
	}
}

public class DynamicallyCreateObjects {
	public static void main(String args[]) throws Exception{
		// getting the class object
		Class<?> cl = Student.class;
		// getting constructor
		Constructor<?> cons = cl.getDeclaredConstructor(String.class, int.class);
		// creating instance dynamically
		Student student = (Student)cons.newInstance("Aditya", 24);
		// calling method
		student.display();
	}
}
