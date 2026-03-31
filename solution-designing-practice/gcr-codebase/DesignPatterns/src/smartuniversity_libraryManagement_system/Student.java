package smartuniversity_libraryManagement_system;

public class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " notified: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}
