import java.util.*;
class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> courses;
    // cons
    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // association
        }
    }
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
        System.out.println();
    }
}
class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void viewStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student); // aggregation
    }

    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}

public class SchoolAndStudent {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Aggregation: School -> Students
        school.addStudent(alice);
        school.addStudent(bob);

        // Association: Student ->Course
        alice.enrollCourse(math);
        alice.enrollCourse(science);
        bob.enrollCourse(math);

        school.displayStudents();
        alice.viewCourses();
        bob.viewCourses();
        math.viewStudents();
        science.viewStudents();
    }
}
