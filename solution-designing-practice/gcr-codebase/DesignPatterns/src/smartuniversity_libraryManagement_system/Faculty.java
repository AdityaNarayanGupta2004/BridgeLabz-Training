package smartuniversity_libraryManagement_system;

public class Faculty implements User {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Faculty " + name + " notified: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}
