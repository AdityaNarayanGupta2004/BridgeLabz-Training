import java.util.*;
abstract class Student {
    protected final String name;
    protected final int id;
    protected String coursename;

    Student(String name, int id, String coursename) {
        this.name = name;
        this.id = id;
        this.coursename = coursename;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public abstract void create();
    public abstract void read();
    public abstract void update(String value);
    public abstract void delete();
}
// making a interface
interface Department {
    void assigncourse(String coursetype);
    void getcoursedetails();
}
// applying inheritance
class CourseEnrollment extends Student implements Department {

    private String coursetype;

    public CourseEnrollment(String name, int id, String coursename) {
        super(name, id, coursename);
    }

    public void create() {
        System.out.println("Student created: " + name);
    }

    public void read() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }

    public void update(String coursetype) {
        this.coursetype = coursetype;
        System.out.println("Course updated to: " + coursetype);
    }

    public void delete() {
        System.out.println("Course enrollment deleted for: " + name);
    }

    public void assigncourse(String coursetype) {
        this.coursetype = coursetype;
    }

    public void getcoursedetails() {
        System.out.println("Name: " + name + ", Course: " + coursetype + ", ID: " + id);
    }
}

class GradeManagement extends Student implements Department {

    private char grade;
    private String coursetype;

    public GradeManagement(String name, int id, String coursename, char grade) {
        super(name, id, coursename);
        this.grade = grade;
    }

    public void create() {
        System.out.println("Grade record created for: " + name);
    }

    public void read() {
        System.out.println("Student Name is : " + name + ",and Grade is1: " + grade);
    }

    public void update(String coursetype) {
        this.coursetype = coursetype;
        System.out.println("Course updated");
    }

    public void delete() {
        System.out.println("Grade record deleted for: " + name);
    }

    public void assigncourse(String coursetype) {
        this.coursetype = coursetype;
    }

    public void getcoursedetails() {
        System.out.println("Name: " + name + ", Course: " + coursetype + ", ID: " + id + ", Grade: " + grade);
    }
}

public class StudentCourseRegistrationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<>();

        int choice;
        do {
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                // CREATE
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("is a student is Grade student: (y/n): ");
                    char type = sc.next().charAt(0);

                    Student s;
                    if (type == 'y') {
                        System.out.print("Enter grade: ");
                        char grade = sc.next().charAt(0);
                        s = new GradeManagement(name, id, course, grade);
                    } else {
                        s = new CourseEnrollment(name, id, course);
                    }

                    s.create();
                    ((Department) s).assigncourse(course);
                    list.add(s);
                    break;
                // READ
                case 2:
                    for (Student st : list) {
                        st.read();
                        ((Department) st).getcoursedetails();
                    }
                    break;

                // UPDATE
                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    for (Student st : list) {
                        if (st.getId() == uid) {
                            System.out.print("Enter new course: ");
                            String newCourse = sc.nextLine();
                            st.update(newCourse);
                        }
                    }
                    break;

                // DELETE
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int d = sc.nextInt();

                    for(int i = list.size() - 1; i >= 0; i--) {
                        Student st = list.get(i);
                            if(st.getId() == d){
                            st.delete();     
                            list.remove(i);   
                            break;            
                        }
                    }
                case 5:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } 
        while(choice != 5);

        sc.close();
    }
}