import java.util.Scanner;
public class StudentsReport {
    String name;
    int rollNo;
    double marks;

    StudentsReport(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void calGrade(double marks) {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Marks: " + marks);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        int rollno = sc.nextInt();
        System.out.println("Enter Marks: ");
        double marks = sc.nextDouble();
        StudentsReport student = new StudentsReport(name, rollno, marks);
        
        System.out.println("Student Details are :");
        student.displayDetails();
        
        student.calGrade(marks);
    }
}
