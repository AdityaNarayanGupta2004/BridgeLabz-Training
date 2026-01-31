package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String gradeLevel;

    Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public String toString() {
        return name + " (" + gradeLevel + ")";
    }
}

public class StudentResultGrouping {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Aditya", "A"),
	            new Student("Dheearj", "B"),
	            new Student("Aman", "A"),
	            new Student("Suarj", "C"),
	            new Student("madhav", "B"),
	            new Student("Ankit", "A"));
		Map<String, List<String>> studentsByGrade = students.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
		                Collectors.mapping(Student::getName, 
                                Collectors.toList())));
		studentsByGrade.forEach((grade, names) -> {
			System.out.println("Grade" + grade+ ": "+ names);
		});
	}
}
