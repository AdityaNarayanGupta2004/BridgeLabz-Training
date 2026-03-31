package com.Aditya.JSON;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
class Student{
	private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { 
    	return name; 
    	}
    public int getAge() {
    	return age; 
    }
}
public class ConvertListtoJsonArray {
	public static void main(String[] args) throws Exception {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Aman", 22));
        student.add(new Student("Neha", 24));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(student);

        System.out.println(jsonArray);
    }
}
